package com.example.democrud.repository;

import com.example.democrud.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title
 * @group 243Б(2)
 * @department PZKS
 * @project demo-crud
 * @class ItemMongoRepository
 * @since 5/10/2022 - 20.26
 **/

@Repository
public interface ItemMongoRepository extends MongoRepository<Item, String> {

}
