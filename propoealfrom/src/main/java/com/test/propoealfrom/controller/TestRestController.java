package com.test.propoealfrom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRestController {
    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return "OK";
    }
}