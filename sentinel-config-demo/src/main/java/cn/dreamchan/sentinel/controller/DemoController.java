package cn.dreamchan.sentinel.controller;

import cn.dreamchan.sentinel.config.ExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }

    @GetMapping("/resource")
    @SentinelResource(value = "/hello2", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource(){
        return "hello resource";
    }


}
