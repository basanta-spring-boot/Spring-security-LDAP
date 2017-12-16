package com.basant.spring.security.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/service")
public class ApplicationController {
	@GetMapping("/validate")
	public String getSecureMessage() {
		return "Authenticated successfully using ldap protocol";
	}

}
