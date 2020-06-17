package cn.dreamchan.nacosdiscoveryconsumeropenfeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-discovery-provider")
public interface ConsumerOpenFeignService {

    @GetMapping("/test")
    String test(@RequestParam("name") String name);
}
