package com.dev.jobportal.config;

import com.zaxxer.hikari.util.DriverDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.beans.factory.annotation.Value;


import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@Component
@PropertySource("classpath:values.properties")
@EnableJpaRepositories(basePackages = {"com.dev.jobportal"})
public class MySqlConfig {
    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.driver-class-name}")
    private String dbdetails;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource cdbDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbdetails);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // dataSource.setUrl("jdbc:mysql://localhost:3306/jobportal");
        //dataSource.setUsername("jobportal");
        //dataSource.setPassword("jobportal");
        return dataSource;
    }

}
