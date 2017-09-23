package com.scolarite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by brahim on 3/11/17.
 */
@Controller

public class LoginController {


    @GetMapping("/login")
    public String Login(){

        return "login";
    }
}
