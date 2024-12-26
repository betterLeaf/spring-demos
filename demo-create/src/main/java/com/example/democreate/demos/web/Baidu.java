package com.example.democreate.demos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Baidu {

    @GetMapping("/baidu")
    public String baidu() {
        return "baidu66666677777776";
    }
}
