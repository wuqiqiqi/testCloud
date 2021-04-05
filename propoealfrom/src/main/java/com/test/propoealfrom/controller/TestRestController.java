package com.test.propoealfrom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRestController {
    @Autowired
    private  RestTemplate restTemplate;

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public String echo() {
        String forObject = restTemplate.getForObject("http://cloudcore/get" ,String.class );
        return forObject;

    }
}