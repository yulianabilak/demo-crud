package com.example.democrud.service.item.impls;

import com.example.democrud.model.Item;
import com.example.democrud.repository.ItemMongoRepository;
import com.example.democrud.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title
 * @group 243Б(2)
 * @department PZKS
 * @project demo-crud
 * @class ItemServiceImpls
 * @since 5/10/2022 - 20.28
 **/
@Service
public class ItemServiceImpls implements IItemService {
    List<Item> list = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "item1", "desc1", LocalDateTime.now(), LocalDateTime.now()),
                    new Item("2", "item2", "desc2", LocalDateTime.now(), LocalDateTime.now()),
                    new Item("3", "item3", "desc3", LocalDateTime.now(), LocalDateTime.now())
            )
    );
    @Autowired
    ItemMongoRepository repository;

    //@PostConstruct
    void init() {
        repository.saveAll(list);
    }

    @Override
    public List<Item> getAll() {
        return repository.findAll();
    }

    @Override
    public Item create(Item item) {
        item.setCreatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        item.setUpdatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
