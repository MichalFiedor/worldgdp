package com.fiedormichal.worldgdp.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DBConfiguration {
    @Value("${jdbcUrl}") String jdbcUrl;
    @Value("${dataSource.user}") String userName;
    @Value("${dataSource.password}") String password;
    @Value("${dataSourceClassName}") String className;

    @Bean
    public DataSource getDataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(className);
        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
        return new NamedParameterJdbcTemplate(getDataSource());
    }
}
