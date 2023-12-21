package com.pluralsight.resttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(required = false) String country) {
        if (country != null && !country.isEmpty()) {
            return "Hello " + country;
        } else {
            return "Hello World";
        }
    }
}
