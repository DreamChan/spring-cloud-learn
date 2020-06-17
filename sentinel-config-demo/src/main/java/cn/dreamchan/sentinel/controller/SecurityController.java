package cn.dreamchan.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/white")
    public String white() {
        return "hello white";
    }

    @GetMapping("/black")
    public String black() {
        return "hello black";
    }

}
