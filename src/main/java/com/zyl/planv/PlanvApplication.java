package com.zyl.planv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zyl.planv.service.mapper")
public class PlanvApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlanvApplication.class, args);
    }
}
