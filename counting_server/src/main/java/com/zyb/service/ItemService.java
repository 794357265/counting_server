package com.zyb.service;

import com.github.pagehelper.PageInfo;

import com.zyb.domain.Item;
import com.zyb.domain.ItemVo;

public interface ItemService {
	
	public void insertItem(Item item) throws Exception;
	
	public void deleteItemById(int id) throws Exception;
	
	public void updateItemById(Item item) throws Exception;
	
	public PageInfo<ItemVo> getItems(int pageSize, int start, Item item) throws Exception;

	public ItemVo getItemById(int id) throws Exception;
}
