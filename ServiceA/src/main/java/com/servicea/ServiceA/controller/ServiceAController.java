package com.servicea.ServiceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/servicea")
    public Response serviceStatus(){
        Response response = new Response();
        response.setMessage("Service A is running!");

        return response;
    };
}

class Response{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}