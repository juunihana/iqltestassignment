package com.iql.testassignment.controller;

import com.fasterxml.jackson.core.util.RequestPayload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public RequestPayload getUserAccount(@PathVariable("id") long id) {


        return null;
    }
}
