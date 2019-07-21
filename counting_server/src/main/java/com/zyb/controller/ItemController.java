package com.zyb.controller;

import com.zyb.response.CommonReturnType;
import com.zyb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * handler
 * @author zyb
 *
 */
@Controller
public class ItemController extends BaseController{
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/queryItem")
	@ResponseBody
	public CommonReturnType queryItem(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("queryItem!");
        String name = request.getParameter("name");
        System.out.println("queryItem!-->>"+name);
        return CommonReturnType.create("queryItem-->>");
	}

	@RequestMapping("/queryItemById")
	public void queryItemById(HttpServletRequest request,HttpServletResponse response) throws Exception{

	}
	
	@RequestMapping("/deleteItemById")
	public @ResponseBody void deleteItemById(HttpServletRequest request) throws Exception{

	}
	
	@RequestMapping("/updateItemById")
	public @ResponseBody void updateItemById(HttpServletRequest request) throws Exception{

	}
	
	@RequestMapping("/addItem")
	public @ResponseBody void addItem(HttpServletRequest request,HttpServletResponse response) throws Exception{

	}
	
}
