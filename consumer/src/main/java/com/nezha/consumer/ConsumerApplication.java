package com.nezha.consumer;

import com.nezha.test.dubbo.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//1.第一种方式，如果直接使用xml方式的话，注释掉配置类：PropertiesConfig
//@ImportResource("classpath:dubbo/consumer.xml")
public class ConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ConsumerApplication.class, args);
        DemoService demoService = (DemoService) ctx.getBean("demoService");
        while (true) {
            try {
                Thread.sleep(1000);
                // call remote method
                String hello = demoService.sayHello("world, NEZHA");
                // get result
                System.out.println(hello);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

}

