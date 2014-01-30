package com.sample.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Home {
	
	@RequestMapping(value = "/home")
	public ModelAndView getActivation(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) {
		return new ModelAndView("home");
	}
}