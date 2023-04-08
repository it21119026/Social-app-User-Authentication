package com.Authentication.Spring_boot_Account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public  String home() {
        return "index";
    }
}
