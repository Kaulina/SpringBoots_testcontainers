package ru.netology.springboots_conditional.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springboots_conditional.service.SystemProfile;

@RestController
@RequestMapping
public class HelloController {
    private final SystemProfile profile;

    public HelloController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")

    public String getProfile() {
        return profile.getProfile();
    }
}
