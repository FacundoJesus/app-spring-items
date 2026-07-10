package com.project.app_items.controllers;

import com.project.app_items.entities.Item;
import com.project.app_items.repositories.iItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private iItemRepository itemRepository;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<List<Item>>(itemRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        Item itemSaved = itemRepository.saveAndFlush(item);
        return new ResponseEntity<Item>(itemSaved, HttpStatus.CREATED);
    }

}
