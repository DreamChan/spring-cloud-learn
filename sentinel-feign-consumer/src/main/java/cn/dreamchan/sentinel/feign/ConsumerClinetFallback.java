package cn.dreamchan.sentinel.feign;

import org.springframework.stereotype.Component;

@Component
public class ConsumerClinetFallback implements ConsumerClient {

    @Override
    public String feign() {
        return "error";
    }

}
