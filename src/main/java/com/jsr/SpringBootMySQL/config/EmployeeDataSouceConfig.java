package com.jsr.SpringBootMySQL.config;

import com.jsr.SpringBootMySQL.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "employeeEntityManagerFactory",
        transactionManagerRef = "employeeEntityManagerFactory",
        basePackages = { "com.jsr.SpringBootMySQL.respository"})
public class EmployeeDataSouceConfig {


    //Get datasource properites

    //Create Entity Manager Factory

    //Create Transaction Manager Factory

    //

}
