package com.solution.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

//This config class can be used
    //to customize
    //create changes or configuration in our persistence tier.

//Any method defined in this config class can return 'bean definitions' that will get stored in spring context.
@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/conference_demo");
        builder.username("spring-start");
        builder.password("Brili#505");

        System.out.println("My custom datasource bean has been initialized and set");

        return builder.build();
    }
}
