package com.justanymsg.presentation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Lazy
public class NonSecureController {

	@RequestMapping(value = "home.jam", method = RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request) {
		request.setAttribute("audioeye", "Y");
		System.out.println("In displayHomePage");
		return "homePage";
	}
}