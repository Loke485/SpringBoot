package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatajpaApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		User u1 = new User(101, "Ramu", "Male", 25, "India"); 
		User u2 = new User(102,"lokesh","male",24,"india");
		User u3 = new User(103,"rajesh","male",24,"india");
		
		/*bean.save(u1);
		      List<User> list = Arrays.asList(u2,u3);
		      bean.saveAll(list); */
	   
	}
}
