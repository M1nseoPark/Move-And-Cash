package com.moveandcash.moveandcash.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SearchController {

    @GetMapping(value = "/input")
    public String inputForm() {
        return "member/inputForm";
    }
}
