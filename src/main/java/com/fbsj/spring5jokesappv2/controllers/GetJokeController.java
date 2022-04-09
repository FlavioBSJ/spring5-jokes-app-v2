package com.fbsj.spring5jokesappv2.controllers;

import com.fbsj.spring5jokesappv2.services.GetJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GetJokeController {

    private final GetJokeService getJokeService;

    public GetJokeController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    @RequestMapping("/")
    public String randomJoke(Model model) {
        model.addAttribute("joke", getJokeService.getRandomQuote());
        System.out.println(model);
        return "joke/index";
    }

}
