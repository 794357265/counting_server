package com.zyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyb.domain.Item;
import com.zyb.domain.ItemVo;
import com.zyb.mapper.ItemMapper;
import com.zyb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public void insertItem(Item item) throws Exception {
		itemMapper.insertItem(item);
	}

	@Override
	public void deleteItemById(int id) throws Exception {
		itemMapper.deleteItemById(id);
	}

	@Override
	public PageInfo<ItemVo> getItems(int pageSize, int start, Item item) throws Exception {
        PageHelper.startPage(start,pageSize);
        List<ItemVo> itemVo = itemMapper.getItems(item);
        PageInfo<ItemVo> pageInfo = new PageInfo<ItemVo>(itemVo,pageSize);
		return pageInfo;
	}

	@Override
	public ItemVo getItemById(int id) throws Exception {
		ItemVo itemVo = itemMapper.getItemById(id);
		return itemVo;
	}

	@Override
	public void updateItemById(Item item) throws Exception {
		itemMapper.updateItemById(item);
	}

}
