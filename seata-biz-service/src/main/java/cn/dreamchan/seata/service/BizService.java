package cn.dreamchan.seata.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BizService {
    @Autowired
    private RestTemplate restTemplate;

    @GlobalTransactional
    public void biz() {
        restTemplate.getForObject("http://127.0.0.1:6020/order", String.class);
        restTemplate.getForObject("http://127.0.0.1:6030/pay", String.class);


    }
}
