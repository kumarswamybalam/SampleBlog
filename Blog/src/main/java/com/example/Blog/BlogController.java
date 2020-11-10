package com.example.Blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@RequestMapping("/home")
	public String home()
	{
		return "This Is Blog Application";
	}

}
