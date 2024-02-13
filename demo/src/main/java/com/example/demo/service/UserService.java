package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User addUser(User user)
	{
		return userRepo.save(user);
	}
	
	public void deleteUser(int id)
	{
		 userRepo.deleteById(id);
	}
	
	public Optional<User> getOneUser(int id)
	{
		return userRepo.findById(id);
	}
	
	public User updateOne(int id)
	{
		User akshay = userRepo.findById(id).get();
	
		
		akshay.setName("Akshay");
		
		return userRepo.save(akshay);
		
		
		
		
	}
	
	
	
}
