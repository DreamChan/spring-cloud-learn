package cn.dreamchan.sentinel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/test")
    public String test(String name){
        return "hello " + name + port;
    }
}
