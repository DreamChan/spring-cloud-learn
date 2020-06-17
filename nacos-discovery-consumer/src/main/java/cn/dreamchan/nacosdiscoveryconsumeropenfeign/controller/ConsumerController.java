package cn.dreamchan.nacosdiscoveryconsumeropenfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/test")
    public String test(String name){
        return restTemplate.getForObject( "http://nacos-discovery-provider/test?name=" + name, String.class);
    }

}
