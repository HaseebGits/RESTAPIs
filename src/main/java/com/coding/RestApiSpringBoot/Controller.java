package com.coding.RestApiSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String function() {
        return "Hello";
    }

    private static class GreetingRequest {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    @PostMapping("/greet")
    public String function2(@RequestBody GreetingRequest request) {
        return " " + request.getName();
    }
}