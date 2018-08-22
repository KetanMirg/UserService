package com.gk.ecommerce.endpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gk.userservice.endpoints.UserService;

/*@RestController
@RequestMapping("users")*/
 	public class UserEndpoint implements UserService{
	
/*	@RequestMapping(value="/getusers",method=RequestMethod.GET)
	public List getUsers()
	{
		return Arrays.asList("user1","user2","user3") ;
	}
	
	@RequestMapping(value="/getcontacts",method=RequestMethod.GET)
	public List getContacts()
	{
		return Arrays.asList("user4","user5","user6") ;
	}*/

	@Override
	public String getUserNames() {
		// TODO Auto-generated method stub
		return "Ketan , Gaurav , Ajay";// Arrays.asList("Ketan","Gaurav","Ajay") ;
	}

	@Override
	public String getUserIds() {
		// TODO Auto-generated method stub
		return "3 , 2 , 1";
	}

}
