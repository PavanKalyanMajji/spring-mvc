package com.pk.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/link1")
	public String getResponse() {
		
		return "response.jsp";
	}
}
