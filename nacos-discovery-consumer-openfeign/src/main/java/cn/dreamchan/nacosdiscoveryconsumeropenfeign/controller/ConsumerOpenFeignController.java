package cn.dreamchan.nacosdiscoveryconsumeropenfeign.controller;

import cn.dreamchan.nacosdiscoveryconsumeropenfeign.service.ConsumerOpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerOpenFeignController {


    @Autowired
    private ConsumerOpenFeignService consumerOpenFeignService;


    @GetMapping("/test")
    public String test(String name){
        return consumerOpenFeignService.test(name);
    }

}
