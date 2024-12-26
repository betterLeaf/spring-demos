package com.example.democreate.demos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Baidu {

    @GetMapping("/baidu")
    @ResponseBody
    public String baidu() {
        return "baidu6666666";
    }
}
