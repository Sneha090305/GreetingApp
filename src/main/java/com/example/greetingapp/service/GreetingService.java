package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Save Greeting
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    // Get Greeting by ID
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    // Get All Greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // Update Greeting
    public Greeting updateGreeting(Long id, String message) {

        Greeting greeting = greetingRepository.findById(id).orElse(null);

        if (greeting != null) {
            greeting.setMessage(message);
            greetingRepository.save(greeting);
        }

        return greeting;
    }

}
