package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, DevOps2025!");
        model.addAttribute("description", "Welcome to our Spring Boot Web Application");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "About DevOps2025");
        model.addAttribute("description", "This is a containerized Spring Boot application running on Java 17");
        return "about";
    }
}