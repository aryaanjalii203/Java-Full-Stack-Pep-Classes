package com.MicroServices;

import java.util.List;


@org.springframework.stereotype.Service
public class UserServicesImplements implements UserServiceInterface {

	List<User> list=List.of(
			new User(101L, "Issar", "9999999"),
			new User(102L, "Singh", "9999999"),
			new User(103L, "Anjali", "9999999"),
			new User(104L, "Arya", "9999999")
			
			);

	@Override
	public User getUserbyId(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUsrId().equals(id)).findAny().orElse(null);
	}
}