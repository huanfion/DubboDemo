package com.zegobird.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UserserviceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceproviderApplication.class, args);
        Main.main(args);
    }

}
