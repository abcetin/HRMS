package ctn.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ctn.hrms.bussiness.abstracts.UserService;
import ctn.hrms.core.entities.User;
import ctn.hrms.core.utilities.results.DataResult;
import ctn.hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/api/user")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/adduser")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	@GetMapping("/getall")
	public DataResult<List<User>> getall() {
		return userService.getAll();
	}

}
