package com.devsuperior.Userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Userdept.Repository.UserRepository;
import com.devsuperior.Userdept.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	@Autowired
	private UserRepository respository;
	@GetMapping
	public List<User> Findall(){
		List<User> user = respository.findAll();
		
		return user;
	}
	@GetMapping(value="/{id}")
	public User findById(@PathVariable Long id){
		User user = respository.findById(id).get();
		
		return user;
	}
	@PostMapping
	public User insert(@RequestBody User user){
		User salvar = respository.save(user);
		
		return salvar;
	}

}
