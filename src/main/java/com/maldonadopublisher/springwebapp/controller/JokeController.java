package com.maldonadopublisher.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maldonadopublisher.springwebapp.services.JokesService;

@Controller
public class JokeController {
    private final JokesService jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
    
}
