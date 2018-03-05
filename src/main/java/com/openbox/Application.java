package com.openbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/3/2.
 */
@EnableAutoConfiguration
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
