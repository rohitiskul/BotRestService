package com.test.botservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Rohit on 6/20/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiAiRequest {
    public String id;
    public ApiAiResult result;


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiAiResult {
        public String resolvedQuery;
        public String action;
        public Params parameters;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Params {
        @JsonProperty("any")
        public String searchTerm;
        public String date;
        @JsonProperty("geo-city")
        public String city;
        @JsonProperty("geo-country")
        public String country;
        public String time;
        @JsonProperty("time-mark")
        public String timeMark;

        @Override
        public String toString() {
            return "[search-term:" + searchTerm +
                    ", date:" + date +
                    ", city:" + city +
                    ", country:" + country +
                    ", time:" + time +
                    ", timeMark:" + timeMark + "]";
        }
    }
}
