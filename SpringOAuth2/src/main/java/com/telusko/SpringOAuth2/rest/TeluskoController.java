package com.telusko.SpringOAuth2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController 
{
	@GetMapping("info")
	public String getCoursesInfo()
	{
		return "Telusko is launching courses";
	}

}
