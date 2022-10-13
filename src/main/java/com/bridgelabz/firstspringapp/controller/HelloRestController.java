package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.model.User;
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
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return "Hello "+ user.getFirstName()+ " " +user.getLastName();
    }
    @PutMapping("/put/{firstName}")
    public String sayHelloUser(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
