package pro.sky.homework_2_12.service;

import pro.sky.homework_2_12.entity.Item;

public interface StoreService {


    Item addItem(String itemName, int itemId);

    Item getItems();

    String itemList();
}
