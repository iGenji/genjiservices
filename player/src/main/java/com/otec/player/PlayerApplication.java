package com.otec.player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PlayerApplication {
    public static void main(String[] args) {
        //start application
        SpringApplication.run(PlayerApplication.class,args);
    }
}
