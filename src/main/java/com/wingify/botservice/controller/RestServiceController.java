package com.wingify.botservice.controller;

import com.wingify.botservice.Main;
import com.wingify.botservice.model.Action;
import com.wingify.botservice.model.ApiAiRequest;
import com.wingify.botservice.model.ApiAiResponse;
import com.wingify.botservice.model.Greeting;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Rohit on 6/16/2016.
 */
@RestController
public class RestServiceController {

    private static final String SOURCE = "a5-events-after-5-source";
    private static final String GENERIC_ERROR = "Something is not right, can you try again?";

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                             HttpServletRequest request) {
        final Greeting greeting = new Greeting();
        greeting.id = 1;
        greeting.content = name;
        return greeting;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/webhook", consumes = "application/json")
    public ApiAiResponse webhook(@RequestBody String json) {
        try {
            final ApiAiRequest request = Main.mapper.readValue(json.getBytes(),
                    ApiAiRequest.class);
            final ApiAiRequest.ApiAiResult apiAiResult = request.result;
            final String action = apiAiResult.action;
            switch (action) {
                case Action.SAVE_LOC:
                    break;
                case Action.SEARCH_EVENTS:
                    searchEvents(apiAiResult.parameters);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ApiAiResponse(SOURCE, GENERIC_ERROR);
        }
        return new ApiAiResponse();
    }

    private ApiAiResponse searchEvents(ApiAiRequest.Params params) throws IOException {
        System.out.println("params=" + params.toString());
        String urlStr = "https://old.after5app.com/v1.0";
        urlStr = urlStr + "/discover?city=Pune" +
                "&country=India" +
                "&cLat=18.5204" +
                "&cLong=73.8567" +
                "&uLat=18.5431007" +
                "&uLong=73.9044848";
        URL url = new URL(urlStr);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestProperty("uuid", "asdasd");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("client", "android");
        con.setRequestProperty("timezone", "GMT+05:30");
        con.setRequestProperty("access_token",
                "FdEZiAptgW8dFnEn9CJK2zMHa2ZhLhfXSuyMISwMsXSq6oaPhADbYzYMK+1fRN9XqTjTKico6h1YOvMIRExZiA892805nxB+653Pxy6xxBs=");

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Request failed to server Http-" + responseCode + "\n" + con.getResponseMessage());
        }
        System.out.println("Response : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());
        return new ApiAiResponse();
//
//        final RestTemplate template = new RestTemplate();
//        final HashMap<String, String> headerMap = new HashMap<>();
//        headerMap.put("uuid", "asdasd");
//        headerMap.put("Content-Type", "application/json");
//        headerMap.put("client", "android");
//        headerMap.put("timezone", "GMT+05:30");
//        headerMap.put("access_token", "FdEZiAptgW8dFnEn9CJK2zMHa2ZhLhfXSuyMISwMsXSq6oaPhADbYzYMK+1fRN9XqTjTKico6h1YOvMIRExZiH069JRyqPb4bfnfSa1iQ8E=");
//        template.headForHeaders("https://api.after5app.com", headerMap);
//        final Map<String, String> getParams = new HashMap<>();
//        getParams.put("city", "Pune");
//        getParams.put("country", "India");
//        getParams.put("cLat", "18.5204");
//        getParams.put("cLong", "73.8567");
//        getParams.put("uLat", "18.5431007");
//        getParams.put("uLong", "73.9044848");
//        ResponseEntity<A5Data> entity = template.getForEntity("https://testapi.after5app.com", A5Data.class, getParams);
//        if (entity.getStatusCode() == HttpStatus.OK) {
//            final A5Data data = entity.getBody();
//            StringBuilder stringBuilder = new StringBuilder();
//            for (Slots slot : data.items) {
//                stringBuilder
//                        .append(slot.slot)
//                        .append("\n--------------\n");
//                for (Event event : slot.data) {
//                    stringBuilder.append(event.name).append("\n");
//                }
//                stringBuilder.append("\n\n");
//            }
//            return new ApiAiResponse(SOURCE, stringBuilder.toString());
//        }
//        throw new IOException("Request failed to server");
    }
}
