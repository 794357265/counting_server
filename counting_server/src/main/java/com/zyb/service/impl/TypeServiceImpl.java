package com.zyb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zyb.domain.Type;
import com.zyb.domain.User;
import com.zyb.mapper.TypeMapper;
import com.zyb.service.TypeService;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper typeMapper;
	
	public List<Type> getTypes() throws Exception{
		return typeMapper.getTypes();
	}

	@Override
	public List<User> getUsers() throws Exception {
		return typeMapper.getUsers();
	}
	
}
