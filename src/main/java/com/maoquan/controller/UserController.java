package com.maoquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maoquan.bean.User;
import com.maoquan.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/init")
	@ResponseBody
	public ModelAndView init() {
		ModelAndView model = new ModelAndView();
		User user = userService.selectUserById(1);
		model.setViewName("user");
		model.addObject(user);
		return model;
	}

}
