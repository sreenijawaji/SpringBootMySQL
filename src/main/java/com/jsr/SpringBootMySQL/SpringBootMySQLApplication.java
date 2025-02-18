package com.jsr.SpringBootMySQL;

import com.jsr.SpringBootMySQL.beanScope.BeanScopeTestService;
import com.jsr.SpringBootMySQL.beanScope.SingletonBeanScope;
import com.jsr.SpringBootMySQL.config.DataSourceConfig;
import com.jsr.SpringBootMySQL.dependencyInjection.ConstructorDIExampleService;
import com.jsr.SpringBootMySQL.dependencyInjection.DependencyAmbiguityExample;
import com.jsr.SpringBootMySQL.dependencyInjection.SetterDIExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SpringBootMySQLApplication implements CommandLineRunner {

	@Autowired
	DataSourceConfig dataSourceConfig;

	@Autowired
	DependencyAmbiguityExample dependencyAmbiguityExample;

	//To load property values from application.properties or application.yml
	@Value("${discount.offer.price}")
	public int discountPrice;

	//@Value("${spring.profiles.active}")
	public String envArgs;


	//To load all properties
	@Autowired
	Environment environment;

	//To execute code when server startup
	@PostConstruct
	public void initLogic(){
		System.out.println("Post Construct Logic Executed..................");
		//Connection pool logic
		//Kafka producer and consumer object
		//data seeding
	}

	public static void main(String[] args) {
		//Method to run spring boot application
		//SpringApplication.run(SpringBootMySQLApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMySQLApplication.class);

		ConstructorDIExampleService constructorDIExampleService = context.getBean("constructorDIExampleService", ConstructorDIExampleService.class);
		constructorDIExampleService.test();

		SetterDIExampleService setterDIExampleService = context.getBean("setterDIExampleService", SetterDIExampleService.class);
		setterDIExampleService.test();

		BeanScopeTestService beanScopeTestService1 =  context.getBean(BeanScopeTestService.class);
		BeanScopeTestService beanScopeTestService2 =  context.getBean(BeanScopeTestService.class);
		BeanScopeTestService beanScopeTestService3 =  context.getBean(BeanScopeTestService.class);

		SingletonBeanScope sb1 = context.getBean(SingletonBeanScope.class);
		SingletonBeanScope sb2 = context.getBean(SingletonBeanScope.class);
		System.out.println(sb1.getPrototypeBeanScope().hashCode() +"-"+sb2.getPrototypeBeanScope().hashCode());

	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("CommandLineRunner Run Executed");
		System.out.println("Discount price------"+ discountPrice);
//		System.out.println("Discount price------"+ environment.getProperty("discount.offer.price"));
//		System.out.println("Technology name from environment------"+ environment.getProperty("technology.name"));
//
//		System.out.println(envArgs);
//		System.out.println("Environment Variable------"+ environment.getProperty("spring.profiles.active"));

		//Edample for map properties file properties to Java Object
		//System.out.println("Config Values -----"+  dataSourceConfig);

		//dependencyAmbiguityExample.testAmbiguity();

		System.out.println("Spring Profiles environment name ------"+ environment.getProperty("environment.name"));

	}
}
