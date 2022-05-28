package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpResponseJsonController {

	@GetMapping("/resp/json")
	public String respJson() {
return "{\"username\":\"cos\"}";		
	}
	
	@GetMapping("/resp/json/object")
	public String respJsonObject() {
		User user = new User();
		user.setUsername("ȫ");
		return "ȫ";
	}
}

