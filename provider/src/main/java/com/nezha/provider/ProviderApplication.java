package com.nezha.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/*.xml")
public class ProviderApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(ProviderApplication.class, args);
        System.in.read();
    }

}

