package com.test.botservice.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.botservice.Main;

import java.io.IOException;

/**
 * Created by Rohit on 6/16/2016.
 */
public class ApiAiResponse {

    public String speech = "";
    public String displayText;
    public String source;

    public ApiAiResponse(String source, String displayText) {
        this.source = source;
        this.speech = displayText;
        this.displayText = displayText;
    }

    public ApiAiResponse(String source, String speech, String displayText) {
        this.source = source;
        this.speech = speech;
        this.displayText = displayText;
    }

    public ApiAiResponse() {
        final ObjectMapper mapper = new ObjectMapper();
        byte[] bytes = "".getBytes();
        try {
            final A5Data data = mapper.readValue(bytes, A5Data.class);
            StringBuilder stringBuilder = new StringBuilder();
            for (Slots slot : data.items) {
                stringBuilder
                        .append(slot.slot)
                        .append("\n--------------\n");
                for (Event event : slot.data) {
                    stringBuilder.append(event.name).append("\n");
                }
                stringBuilder.append("\n\n");
            }
            displayText = speech = stringBuilder.toString();
            source = "anything-as-source";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
