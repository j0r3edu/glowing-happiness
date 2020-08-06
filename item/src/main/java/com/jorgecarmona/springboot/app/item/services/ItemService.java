package com.jorgecarmona.springboot.app.item.services;

import com.jorgecarmona.springboot.app.item.model.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);

}
