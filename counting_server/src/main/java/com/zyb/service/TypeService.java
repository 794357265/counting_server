package com.zyb.service;

import java.util.List;

import com.zyb.domain.Type;
import com.zyb.domain.User;


public interface TypeService {
	
	public List<Type> getTypes() throws Exception;
	
	public List<User> getUsers() throws Exception;

}
