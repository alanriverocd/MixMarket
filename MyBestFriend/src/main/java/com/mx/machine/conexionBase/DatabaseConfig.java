package com.mx.machine.conexionBase;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName("oracle.jdbc.driver.OracleDriver")
                .url("jdbc:oracle:thin:@//oracle-176856-0.cloudclusters.net:10005/XE")
                .username("BDGENERICA")
                .password("Base#2025")
                .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    
}