package com.nezha.test.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestDubboBootProviderApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TestDubboBootProviderApplication.class, args);
        new SpringApplicationBuilder(TestDubboBootProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
