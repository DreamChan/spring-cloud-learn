package cn.dreamchan.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }
}
