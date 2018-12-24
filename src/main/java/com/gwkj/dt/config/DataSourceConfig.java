package com.gwkj.dt.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {
    @Bean(name = "db1")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.db1")
    public DataSource db1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "db2")
    @Qualifier("secondaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.db2")
    public DataSource db2() {
        return DataSourceBuilder.create().build();
    }

}

