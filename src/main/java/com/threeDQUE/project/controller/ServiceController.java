package com.threeDQUE.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    Logger logger = LoggerFactory.getLogger(ServiceController.class);

    //prints reversed string if a valid parameter is given
    @GetMapping("/reverse/{targetString}")
    public String reverse(@PathVariable(value = "targetString") String target) {

        logger.info("string to reverse:" + target);

        return new StringBuilder(target).reverse().toString();
    }
}
