package com.croma.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croma.user.model.User;
import com.croma.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public void postUser(User user)
	{
		user.setName(user.getName()+"CROMA");
		repository.save(user);
	}
	public List<User> getUsers()
	{
		return repository.getUsers();
	}
	public User getUserById(int id)
	{
		return repository.getUser(id);
	}
	public void deleteAll()
	{
		repository.deleteAll();
	}
	public void deleteById(int id)
	{
		repository.deleteById(id);
	}

}
