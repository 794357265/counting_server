package com.zyb.mapper;

import com.zyb.domain.Item;
import com.zyb.domain.ItemVo;

import java.util.List;

public interface ItemMapper {
	
	public void insertItem(Item item) throws Exception;
	
	public void deleteItemById(int id) throws Exception;
	
	public void updateItemById(Item item) throws Exception;
	
	public List<ItemVo> getItems(Item item) throws Exception;
	
	public ItemVo getItemById(int id) throws Exception;
}
