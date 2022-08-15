package com.practice.containers;

import com.practice.containers.beans.Person;
import com.practice.containers.beans.Vehicle;
import com.practice.containers.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class ContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

// 		The default name & passwords can be modified just by changing the properties file
//              spring.security.user.name = Rupesh
//              spring.security.user.password = 1234
	
	}

}
