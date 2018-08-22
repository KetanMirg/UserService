package com.gk.ecommerce;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;
import com.gk.userservice.endpoints.UserService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@Component
public class CommandLineRunnerDemo implements  CommandLineRunner{

	
	@Autowired
	UserService getService;
	
	// used for getting the client services info to communicate(by using name of the service) with it without using feign client 
	@Autowired
	private EurekaClient eurekaClient;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("##############"+getService.getUserNames());
		
		doRequest();
	}
	
	
	// logic used for getting the client services info to communicate(by using name of the service) with it without using feign client
	public void doRequest() {
		
		//getting the info from the Zuul server where this(userservice) has been published - via application.yml
	    Application application 
	      = eurekaClient.getApplication("paymentservice");
	    InstanceInfo instanceInfo = application.getInstances().get(0);
	    String hostname = instanceInfo.getHostName();
	    int port = instanceInfo.getPort();
	    
	    System.out.println("Host name:-"+hostname);
	    System.out.println("Port:-"+port);
	    // ...
	}

}
