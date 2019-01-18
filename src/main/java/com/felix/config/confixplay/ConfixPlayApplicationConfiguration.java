package com.felix.config.confixplay;

import com.felix.config.confixplay.config.GlobalConfiguration;
import com.felix.config.confixplay.service.ExampleService;
import com.felix.config.confixplay.service.ExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Felix Porres on 14/01/2019.
 */
@Configuration
public class ConfixPlayApplicationConfiguration {
    @Autowired
    private GlobalConfiguration myConfig;

    @Bean
    @ConfigurationProperties(prefix= "application")
    GlobalConfiguration myConfig(){return new GlobalConfiguration();}

    @Bean
    public ExampleService exampleService(){
        return new ExampleServiceImpl();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder)
    {
        System.out.println("timeout is " + myConfig.getConnectionTimeout());
        return builder
            .setConnectTimeout(myConfig.getConnectionTimeout())
            .build();
    }
}
