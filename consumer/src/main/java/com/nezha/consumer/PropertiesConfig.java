package com.nezha.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description: xxxxx <br>
 * @Date: 2019/1/2 4:12 PM <br>
 * @Author: objcat <br>
 * @Version: 1.0 <br>
 */
//2.第二种方式
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({"classpath:dubbo/*.xml"})
public class PropertiesConfig {
}
