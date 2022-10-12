package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " From BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz";
    }
}
