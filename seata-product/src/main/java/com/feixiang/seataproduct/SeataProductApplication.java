package com.feixiang.seataproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan("com.feixiang.seataproduct.mapper")
public class SeataProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataProductApplication.class, args);
    }

}
