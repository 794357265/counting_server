package com.zyb.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyb.service.TypeService;

@Controller
public class TypeControlller {

	@Autowired
	private TypeService typeService;
	
	@RequestMapping("/queryType")
	public void queryType(HttpServletResponse response) throws Exception{
		System.out.println("TypeControlller!");

	}
	
	@RequestMapping("/queryUser")
	public void queryUser(HttpServletResponse response) throws Exception{
		System.out.println("queryUser!");

	}
	
	
}
