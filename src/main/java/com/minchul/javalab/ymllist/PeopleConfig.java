package com.minchul.javalab.ymllist;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleConfig {

    @Bean
    @ConfigurationProperties(prefix = "korea")
    public PeopleProps peopleProps() {
        return new PeopleProps();
    }
}
