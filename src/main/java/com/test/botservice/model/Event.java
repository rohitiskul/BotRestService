package com.test.botservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Rohit on 6/16/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    public String name;
}
