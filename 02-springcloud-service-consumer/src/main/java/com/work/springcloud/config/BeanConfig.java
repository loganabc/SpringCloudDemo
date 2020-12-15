package com.work.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //等价于一个Spring applicationContext.xml配置文件
public class BeanConfig {
    /**
     * @Bean 等价于：
     * <bean id="restTemplate" class="xxx.xxx.xxx.RestTemplate"></>
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
