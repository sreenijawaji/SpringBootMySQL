package com.jsr.SpringBootMySQL.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//how to map or bind config properties to java object ?
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Data
@AllArgsConstructor
@Component
@NoArgsConstructor
public class DataSourceConfig {

    private String url;
    private String username;
    private String password;

}
