package com.springcamp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 5/11/14
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySource("classpath:custom.properties")
public class BootSampleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootSampleApplication.class, args);
    }
}
