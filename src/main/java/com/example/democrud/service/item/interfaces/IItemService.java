package com.example.democrud.service.item.interfaces;

import com.example.democrud.model.Item;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title
 * @group 243Б(2)
 * @department PZKS
 * @project demo-crud
 * @class IItemService
 * @since 5/10/2022 - 20.28
 **/
public interface IItemService {
    List<Item> getAll();
    Item create(Item item);
    Item update(Item item);
    Item get(String id);
    void delete(String id);
}