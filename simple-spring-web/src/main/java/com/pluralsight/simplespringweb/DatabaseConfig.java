package com.pluralsight.simplespringweb;

import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
@Configuration
public class DatabaseConfig {
    private BasicDataSource basicDataSource;
    @Bean
    public DataSource dataSource(){
        return (DataSource) basicDataSource;
    }
    @Autowired
    public DatabaseConfig (@Value("${datasource.url}") String url,
                           @Value("${datasource.username}") String username,
                           @Value("${datasource.password}") String password)
    {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        System.out.println(url + " : " + username + " : " + password);
    }
}
