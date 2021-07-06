package com.anshu.RestServices;

import java.net.URI;
import java.util.List;

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
public class UserResource {
	
@Autowired
private UserDao service;

//retrieve All users

@GetMapping("/AllUsers")
public List<User> retrieveAllUser(){
	
	return service.getUsers();	
	
}

//retrieve user buy id

@GetMapping("/users/{id}")

public User getUserById(@PathVariable int id) {
	
	User check= service.getUserById(id);
	
	if(check==null) {
		throw new UserNotFoundException("id- "+id);
	}
	return check;
		
	
}

//Add USer
@PostMapping("/addUser")
public ResponseEntity<Object> addUser(@RequestBody User postUser) {
	
	//System.out.println("name is "+postUser.getName());
	
	User savedUser= service.addUser(postUser);
	
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	
	return  ResponseEntity.created(location).build();



}

@DeleteMapping("/delete/{id}")

public void deleteUserById(@PathVariable int id) {
	
	User check= service.deleteUser(id);
	
	if(check==null) {
		throw new UserNotFoundException("id- "+id);
	}
	
    
	
}






}
