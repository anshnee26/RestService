package com.anshu.RestServices;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserJPAResource {
	
@Autowired
private UserDao service;

@Autowired
private UserRepo userRepo;

//retrieve All users

@GetMapping("/jpa/AllUsers")
public List<User> retrieveAllUser(){
	
	return userRepo.findAll();
	
}

//retrieve user buy id

@GetMapping("/jpa/users/{id}")

public User getUserById(@PathVariable int id) {
	
	Optional<User> check= userRepo.findById(id);
	
	if(!check.isPresent()) {
		throw new UserNotFoundException("id- "+id);
	}
	return check.get();
		
	
}

//Add USer
@PostMapping("/jpa/addUser")
public ResponseEntity<Object> addUser(@RequestBody User postUser) {
	
	//System.out.println("name is "+postUser.getName());
	
	User savedUser= userRepo.save(postUser);
	
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	
	return  ResponseEntity.created(location).build();



}

@DeleteMapping("jpa//delete/{id}")

public void deleteUserById(@PathVariable int id) {
	
	userRepo.deleteById(id);
	
	
    
	
}






}
