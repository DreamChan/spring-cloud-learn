package cn.dreamchan.sentinel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${test:未设置}")
    private String test;

    @GetMapping("/test")
    public String test(){
        return "值为： " + test;
    }
}
