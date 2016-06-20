package com.wingify.botservice.controller;

import com.wingify.botservice.model.ApiAiResponse;
import com.wingify.botservice.model.Greeting;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Rohit on 6/16/2016.
 */
@RestController
public class RestServiceController {

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
        System.out.println("json\n" + json);
        return new ApiAiResponse();
    }
}
