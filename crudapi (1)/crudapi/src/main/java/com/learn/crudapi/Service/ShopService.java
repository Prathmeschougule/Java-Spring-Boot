package com.learn.crudapi.Service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.learn.crudapi.Model.Shop;

public interface ShopService {

    Map<Integer, Shop> getItems();

    Shop getItemByid(int id);

    Shop saveItems(Shop shop);

    String updateItem(int Id, Shop shop);

    String deleteItem(int id);

}
