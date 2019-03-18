package com.nexcloud.api.controller.user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nexcloud.api.service.user.UserService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
	static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired private UserService userService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getUser() {
		return userService.getUserList();
	}
}