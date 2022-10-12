package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"","/","/message"})
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
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return "Hello "+ user.getFirstName()+ " " +user.getLastName();
    }
}
