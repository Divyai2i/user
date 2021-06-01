package com.userModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UserApplication {

	public static void main(String[] args)   
	{  
		SpringApplication.run(UserApplication.class, args);  
	}  
}
