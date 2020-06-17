package cn.dreamchan.sentinel.controller;

import cn.dreamchan.sentinel.feign.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerClient feignClient;

    @GetMapping("/hello")
    public String hello() {
        return feignClient.feign();
    }
}
