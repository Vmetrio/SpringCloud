package org.big.cloud.web.controller;

import org.big.cloud.web.service.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private final static Logger logger = LoggerFactory.getLogger(WebController.class);

    @Autowired
    WebService webService;

    @GetMapping("/demo/{name}")
    public String  PublicList(@PathVariable("name") String name) {
        String json = this.webService.demo(name);
        return json;
    }

}