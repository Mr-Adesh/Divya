package com.croma.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.croma.user.model.User;

@Repository
public class UserRepository {
	List<User> list = new ArrayList<>();
	
	public User save(User user)
	{
		list.add(user);
		return user;
	}
	
	public List<User> getUsers()
	{
		return list;
	}
	
	public User getUser(int index)
	{
		return list.get(index);
	}
	public void deleteAll()
	{
		list.clear();
	}
	public void deleteById(int index)
	{
		list.remove(index);
	}
	
	
	

}
