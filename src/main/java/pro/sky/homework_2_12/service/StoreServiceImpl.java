package pro.sky.homework_2_12.service;

import pro.sky.homework_2_12.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{

    private final List<Item> itemList;

    public StoreServiceImpl(List<Item> itemList){

        this.itemList = itemList;

        addItem("Tomato", 666);
    }

    public String itemList(){
        return "Корзина:\n " + itemList;
    }

    @Override
    public Item addItem(String itemName, int itemId){

        Item item = new Item(itemName, itemId);
        itemList.add(item);

        return item;
    }

    @Override
    public Item getItems(){

        for (Item i : itemList){
            return i;
        }

        return null;
    }
}
