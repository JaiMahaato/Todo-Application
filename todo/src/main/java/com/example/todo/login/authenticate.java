package com.example.todo.login;

import org.springframework.stereotype.Service;

@Service 
public class authenticate {
	
	public boolean authenticate1(String username,String password) {
		
		boolean isvalid =username.equalsIgnoreCase("jaikumar");
		boolean isvalidpassword= password.equalsIgnoreCase("1234");
		
		return isvalid && isvalidpassword ;
	}

}
