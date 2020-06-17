package cn.dreamchan.sentinel.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ExceptionUtil {

    public static String exHandler(BlockException e){
        return "exHandler error";
    }

}
