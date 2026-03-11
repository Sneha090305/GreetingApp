package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {


    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // UC4 - Save Greeting
    @PostMapping("/greeting")
    public Greeting saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }

    // UC5 - Get Greeting by ID
    @GetMapping("/greeting/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    // UC6 - Get All Greetings
    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    // UC7 - Update Greeting
    @PutMapping("/greeting/{id}")
    public Greeting updateGreeting(@PathVariable Long id,
                                   @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

}
