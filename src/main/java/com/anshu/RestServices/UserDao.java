package com.anshu.RestServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	private static List<User> user= new ArrayList<>();
	
	private static int count=3;
	
	static {
		user.add(new User(1, "Anshu", new Date()));
		user.add(new User(2, "Rutu", new Date()));
		user.add(new User(3, "Monu", new Date()));
			
	}
	
	public List<User> getUsers() {
		
		return user;	
	}
	
	public User getUserById(int id) {
		
		for (User users: user) {
			if(users.getId()==id) {
				return users;
			}
					
		}
		
		return null;
	}
	
	 public User addUser(User usering) {
		
		
		 if (usering.getId()==null) {
			 usering.setId(++count);
		 }
		
		user.add(usering);
		
		return usering;
	 }
		
	 public User deleteUser(int id) {
			
			
		 Iterator<User> iterator=  user.iterator();
		
		while(iterator.hasNext()) {
			User user=iterator.next();
			
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		
		return null;	
		
	 }
		
		

	
	
	
	
	

}
