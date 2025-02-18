package com.jsr.SpringBootMySQL.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class CrossOriginConfig implements WebMvcConfigurer {

    /*
    @Override
    public void addCorsMapp(CorsRegistry registry){
        registry.addMapping("/api//**").allowCredentials()
    }*/

}
