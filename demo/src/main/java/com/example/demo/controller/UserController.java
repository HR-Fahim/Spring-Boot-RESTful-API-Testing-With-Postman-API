package main.java.com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUserInfo(@RequestParam(value = "name", defaultValue = "HR Fahim") String name,
                              @RequestParam(value = "email", defaultValue = "hrfprofessional@gmail.com") String email) {
        return "Name: " + name + ", " + "Email: " + email;
    }

}
