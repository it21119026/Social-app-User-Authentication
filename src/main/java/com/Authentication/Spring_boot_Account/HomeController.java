package com.Authentication.Spring_boot_Account;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @GetMapping
    public String home(@RequestParam(name = "logout", required = false, defaultValue = "true") boolean logout) {
        return "index";
    }

    @GetMapping("/login")
    String login() {
        return "app-user/login";
    }
}
