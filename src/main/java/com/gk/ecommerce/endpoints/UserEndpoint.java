package com.gk.ecommerce.endpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserEndpoint {
	
	@RequestMapping(value="/getusers",method=RequestMethod.GET)
	public List getUsers()
	{
		return Arrays.asList("user1","user2","user3") ;
	}
	
	@RequestMapping(value="/getcontacts",method=RequestMethod.GET)
	public List getContacts()
	{
		return Arrays.asList("user4","user5","user6") ;
	}

}
