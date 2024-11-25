package com.example.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class login {

	private authenticate auth;
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login1() {
		return "login";
	}
	
	
	public login(authenticate auth) {
		super();
		this.auth = auth;
	}


	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String welcome(@RequestParam String name,ModelMap Model,@RequestParam String password) {
		
		if(auth.authenticate1(name, password)) {
		Model.put("name", name);
		return "welcome";}
		Model.put("errormessage","Invalid Credentials! Please Try Again");
		return "login";
		
	}

}
