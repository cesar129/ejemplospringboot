package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hola() {
        String message = "Hola Mundo";
        System.out.println(message);
        if(message.equals("Hola Mundo")) {
            return "Hola";
        }else if(message.equals("Hola Mundo2")) {
            return "Hola2";
        } else if (message.equals("Hola Mundo3")) {
            return "Hola3";
        }

        return "Hola";
    }
}
