package com.example.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class hello {
@RequestMapping("hello")
@ResponseBody
public String jai() {
	return "jai the ";
}



@RequestMapping("hello1jsp") 
public String jai1() {
	return "hello";
}

	}


