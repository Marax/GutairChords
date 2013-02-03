package cz.uhk.fim.guitarchords.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cz.uhk.fim.guitarchords.entity.User;
import cz.uhk.fim.guitarchords.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String listUsers(Map<String, Object> map) {

		map.put("user", new User());
		map.put("userList", userService.listUsers());

		return "user";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") User user,
			BindingResult result) {

		userService.addUser(user);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{userId}")
	public String deleteContact(@PathVariable("userId") Integer userId) {

		userService.removeUser(userId);

		return "redirect:/index";
	}
}
