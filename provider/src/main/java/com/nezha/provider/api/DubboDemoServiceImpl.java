package com.nezha.provider.api;

import com.alibaba.dubbo.rpc.RpcContext;
import com.nezha.test.dubbo.DemoService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: xxxxx <br>
 * @Date: 2019/1/2 3:03 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */

@Service
public class DubboDemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
