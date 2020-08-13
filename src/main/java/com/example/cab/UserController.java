package com.example.cab;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cab.dto.Credentials;
import com.example.cab.model.Route;
import com.example.cab.model.User;
import com.example.cab.service.RouteService;
import com.example.cab.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	RouteService routeService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "register";
	}
	
	
	@RequestMapping(value = "/addusers", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);	
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute("cred")Credentials credentials, Model model) {
		boolean isExists = userService.authenticateUser(credentials.getUsername(), credentials.getPassword());
		
		System.out.println(routeService.getAllRoute());
		if(isExists) {
			model.addAttribute("rList", routeService.getAllRoute());
			return "routeview";
		}
		
		return "routeview";
	}
	
	@RequestMapping(value = "/routes", method = RequestMethod.GET)
	@ResponseBody
	public List<Route> getAllRoutes() {
		return routeService.getAllRoute();
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseBody
	public String saveUserDetails(@RequestBody User user) {
		userService.saveUser(user);	
		return "Sucessfully Saved user details";
	}
	
}
