package com.openbox.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 描述: 多数据源配置
 *
 * @author: luming.shi   Created on 18/3/5.
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "florida.datasource.master")
    public DataSource dataSourceMaster() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "florida.datasource.slave01")
    public DataSource dataSourceSlave01() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "florida.datasource.slave02")
    public DataSource dataSourceSlave02() {
        return DataSourceBuilder.create().build();
    }
}
