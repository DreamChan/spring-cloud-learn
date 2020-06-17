package cn.dreamchan.sentinel.config;


import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
public class SentinelConfig {

    @PostConstruct
    public void init() {
        WebCallbackManager.setUrlBlockHandler(new DemoUrlBlockHandler());
        WebCallbackManager.setRequestOriginParser(new IpRequestOriginParser());
    }
}
