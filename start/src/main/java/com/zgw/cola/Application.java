package com.zgw.cola;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Spring Boot Starter
 *
 * @author zgw
 * @since 2021-03-30
 */
@SpringBootApplication(scanBasePackages = {"com.zgw.cola"})
@MapperScan("com.zgw.cola.dao")
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
