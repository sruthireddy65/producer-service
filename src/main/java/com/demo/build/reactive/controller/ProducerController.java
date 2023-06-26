package com.demo.build.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProducerController {

    @GetMapping("/getName")
    public Mono<String> getEmployeeName() {
        return Mono.just("Sruthi");
    }
}
