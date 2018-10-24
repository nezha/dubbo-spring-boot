package com.nezha.test.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.nezha.test.dubbo.DemoService;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        try {
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + InetAddress.getLocalHost());
            return "Hello " + name + ", response from provider: " + InetAddress.getLocalHost();
        }catch (Exception e){
            return "net error";
        }

    }
}
