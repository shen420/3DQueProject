package com.threeDQUE.project.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandlerController implements ErrorController {
    private final static String ERROR_PATH = "/error";

    //prints error message if the URL path is invalid
    @GetMapping(ERROR_PATH)
    public String error() {
        return "Enter valid URL";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
