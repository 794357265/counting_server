package com.zyb.controller;

import com.zyb.error.BusinessException;
import com.zyb.error.EmBusinessError;
import com.zyb.response.CommonReturnType;
import com.zyb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * handler
 * @author zyb
 *
 */
@Controller
@RequestMapping("/item")
@CrossOrigin
public class ItemController extends BaseController{
	
	@Autowired
	private ItemService itemService;

	@RequestMapping(value="/queryItem",consumes={CONTENT_TYPE_FORMED},method={RequestMethod.POST})
	@ResponseBody
	public CommonReturnType queryItem(HttpServletRequest request,HttpServletResponse response) throws BusinessException {
		System.out.println("queryItem!");
        String name = request.getParameter("name");
        if(name == null || "".equals(name)){
			throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
		}
		System.out.println("queryItem!-->>"+name);
        return CommonReturnType.create("queryItem-->>");
	}

	@RequestMapping("/queryItemById")
	@ResponseBody
	public String queryItemById(HttpServletRequest request,HttpServletResponse response) throws Exception{
		return "{'queryItemById':'2'}";
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
