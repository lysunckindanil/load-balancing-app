package org.example.mainservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${eureka.instance.instance-id}")
    String id;

    @GetMapping
    public String index() {
        return id;
    }
}
