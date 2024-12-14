package com.learn.crudapi.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.learn.crudapi.Model.Shop;
import com.learn.crudapi.Service.ImplementShopService;
import com.learn.crudapi.Service.ShopService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@Controller
@RequestMapping("items")

public class ShopControler {

    // Object Creation - JVM & Programer
    // ShopService shopService = new ImplementShopService();

    // Object Creation by -Spring Ioc Container || di - AutoWiring
    @Autowired
    ShopService shopService;

    @GetMapping
    public Map getAllItems() {
        return shopService.getItems();
    }

    @GetMapping("/{id}")
    public Shop getAllItemsByid(@PathVariable int id) {

        return shopService.getItemByid(id);
    }

    @PostMapping
    public Shop createItem(@RequestBody Shop shop) {
        // Store In hashMap

        return shopService.saveItems(shop);
    }

    @PutMapping("/{id}")
    public String updateItem(@PathVariable int id, @RequestBody Shop shop) {
        return shopService.updateItem(id, shop);
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {

        // Check Id Is Avilable OR Not
        return shopService.deleteItem(id);
    }

}
