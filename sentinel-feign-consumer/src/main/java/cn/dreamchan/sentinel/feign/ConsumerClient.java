package cn.dreamchan.sentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sentinel-feign-provider", fallback = ConsumerClinetFallback.class)
public interface ConsumerClient {

    @GetMapping("/feign")
    String feign();

}
