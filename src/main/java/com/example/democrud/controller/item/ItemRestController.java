package com.example.democrud.controller.item;

import com.example.democrud.model.Item;
import com.example.democrud.service.item.impls.ItemServiceImpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title
 * @group 243Б(2)
 * @department PZKS
 * @project demo-crud
 * @class ItemRestController
 * @since 5/10/2022 - 20.30
 **/
@RestController
@RequestMapping("/api/v1/items")
public class ItemRestController {
    @Autowired
    ItemServiceImpls service;

    @GetMapping("/")
    List<Item> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Item showOne(@PathVariable String id)
    {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable String id)
    {
        service.delete(id);
    }

    @PostMapping("")
    Item createOne(@RequestBody Item item) {
        return service.create(item);
    }

    @PutMapping("")
    Item updateOne(@RequestBody Item item) {
        return service.update(item);
    }
}