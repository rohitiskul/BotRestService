package com.test.botservice.controller;

import com.test.botservice.Main;
import com.test.botservice.model.Action;
import com.test.botservice.model.ApiAiRequest;
import com.test.botservice.model.ApiAiResponse;
import com.test.botservice.model.Greeting;
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

    private static final String SOURCE = "anything-as-source";
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
        String urlStr = "https://****.url.****/v1.0";
        urlStr = urlStr + "/path?params=param";
        URL url = new URL(urlStr);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestProperty("uuid", "asdasd");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("client", "android");
        con.setRequestProperty("timezone", "GMT+05:30");
        con.setRequestProperty("access_token", "*********");

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
    }
}
