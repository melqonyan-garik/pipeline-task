package com.garik.springmvcapp1.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "first/second/exit";

    }

}
