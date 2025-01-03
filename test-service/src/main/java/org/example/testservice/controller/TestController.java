package org.example.testservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.StringJoiner;

@RestController
public class TestController {
    private final RestTemplate restTemplate;
    private final String baseUrl = "http://localhost:8082/main-service";

    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{quantity}")
    public String index(@PathVariable int quantity) {
        StringJoiner stringJoiner = new StringJoiner("\n");
        for (int i = 0; i < quantity; i++) {
            stringJoiner.add(restTemplate.getForObject(baseUrl, String.class));
        }
        return stringJoiner.toString();
    }
}
