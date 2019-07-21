package com.zyb.mapper;

import java.util.List;

import com.zyb.domain.Type;
import com.zyb.domain.User;

public interface TypeMapper {
	public List<Type> getTypes() throws Exception;
	
	public void updateType(Type type) throws Exception;
	
	public void deleteType(int id) throws Exception;
	
	public List<User> getUsers() throws Exception;

}
