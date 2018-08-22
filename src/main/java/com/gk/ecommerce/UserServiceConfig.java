package com.gk.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gk.userservice.endpoints.UserService;

import feign.Contract;

@Configuration
public class UserServiceConfig {
	
	
	@Bean 
	public Contract feignContract() 
	{ 
		return new feign.Contract.Default(); 
	}
	
	@Bean
	UserService getService()
	{
		com.gk.ecommerce.endpoints.UserEndpoint ep = new com.gk.ecommerce.endpoints.UserEndpoint();
		return ep ;
	}

}
