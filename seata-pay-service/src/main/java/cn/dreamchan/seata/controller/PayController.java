package cn.dreamchan.seata.controller;

import cn.dreamchan.seata.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String order() {
        payService.save();
        return "success";
    }

}