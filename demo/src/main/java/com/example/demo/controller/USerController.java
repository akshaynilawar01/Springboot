package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/")
public class USerController {
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/added")
	public User AddUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getOnee(@PathVariable int id)
	{
		return userService.getOneUser(id);
	}
	
	@DeleteMapping("/user/deleted/{id}")
	public void Delete(@PathVariable int id)
	{
		 userService.deleteUser(id);
	}
	
	@PutMapping("/user/updated/{id}")
	public User Updated(@RequestBody User user, @PathVariable int id)
	{
		return userService.updateOne(id);
	}
}
