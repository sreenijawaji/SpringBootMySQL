package com.jsr.SpringBootMySQL.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    private static Logger LOGGER = LoggerFactory.getLogger(ProfileConfig.class);

    // @Profile annotation is used to conditionally activate/register
    // Used to develop an "if-then-else" conditional checking to configure
    // Allows to register beans by condition

    @Bean
    @Profile(value = "dev")
    public void devConfig() {
        LOGGER.info("Successfully loaded the development environment.");
    }


    @Bean
    @Profile(value = "test")
    public void testConfig() {
        LOGGER.info("Successfully loaded the testing environment.");
    }


    @Bean
    @Profile(value = "qa")
    public void qaConfig() {
        LOGGER.info("Successfully loaded the qa environment.");
    }


    @Bean
    @Profile(value = "prod")
    public void prodConfig() {
        LOGGER.info("Successfully loaded the production environment.");
    }
}

