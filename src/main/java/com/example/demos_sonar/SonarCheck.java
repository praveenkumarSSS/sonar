package com.example.demos_sonar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarCheck {
	
	@GetMapping("/sonarInfo")
	public String team()
	{
		int teams;
		int guru;
		String s1="praveen";
	return "hi";
	}

}
