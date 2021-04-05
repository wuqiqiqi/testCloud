package com.test.cloudcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/**")
public class cloudCoreController {

    @RequestMapping("/get")
    public String getProposalId(){
        return "06252135216545";
    }
    @RequestMapping("/encute")
    public String getEncute(){
        return "06252135216545";
    }

}
