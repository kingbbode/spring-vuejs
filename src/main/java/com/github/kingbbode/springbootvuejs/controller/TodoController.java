package com.github.kingbbode.springbootvuejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
