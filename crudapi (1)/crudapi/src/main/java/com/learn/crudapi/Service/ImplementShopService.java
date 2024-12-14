package com.learn.crudapi.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.learn.crudapi.Model.Shop;

@Service
public class ImplementShopService implements ShopService {

    private Map<Integer, Shop> shopmap = new HashMap<>();
    private int shopid = 0;

    @Override
    public Map<Integer, Shop> getItems() {
        return shopmap;
    }

    @Override
    public Shop getItemByid(int id) {

        return shopmap.get(id);

    }

    @Override
    public Shop saveItems(Shop shop) {
        shop.setId(genrateNextId());
        shopmap.put(shop.getId(), shop);
        return shop;
    }

    @Override
    public String updateItem(int id, Shop shop) {

        Shop existiShop = shopmap.get(id);

        if (existiShop != null) {

            if (shop.getId() == 0) {

                existiShop.setId(shop.getId());

            }

            if (shop.getItem() != null) {
                existiShop.setItem(shop.getItem());

            }

            if (shop.getAuther() != null) {
                existiShop.setAuther(shop.getAuther());

            }

            return "Succesfully Data is Update";
        } else {
            return "Filed Data is Update";
        }

    }

    @Override
    public String deleteItem(int id) {

        if (shopmap.containsKey(id)) {

            shopmap.remove(id); // Remove id From The Hash Map
            return "Data Deleted succefully ";

        } else {
            return " Id Not Found ";
        }

    }

    private int genrateNextId() {

        return shopid++;

    }
}
