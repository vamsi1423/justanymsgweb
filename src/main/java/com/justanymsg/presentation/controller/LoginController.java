/**
 * 
 */
package com.justanymsg.presentation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vamsi
 *
 */
@Controller
@Lazy
public class LoginController {

	@RequestMapping(value = "login.jam", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("In login"+userName+"%%"+password);
		
		return "homePage";
	}
}
