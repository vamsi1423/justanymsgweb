package com.justanymsg.presentation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Lazy
public class RegistrationController {
	@RequestMapping(value = "register.jam", method = RequestMethod.GET)
	public String displayRegistrationPage(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("In displayRegistrationPage" + userName + "%%"
				+ password);

		return "register";
	}

	@RequestMapping(value = "submitRegister.jam", method = RequestMethod.POST)
	public String submitRegistrationPage(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("In submitRegistrationPage" + userName + "%%"
				+ password);
		HttpSession session = request.getSession();
		session.setAttribute("firstName", request.getParameter("firstName"));
		session.setAttribute("lastName", request.getParameter("lastName"));
		System.out.println("Session Values::"+session.getAttribute("firstName")+"&&&&&"+session.getAttribute("lastName"));
		return "profile";
	}
}
