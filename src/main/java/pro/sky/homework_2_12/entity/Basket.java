package pro.sky.homework_2_12.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {

    public Map<Integer, Integer> itemCounter = new HashMap<>();

    public List<Integer> addItem(List<Integer> items){

        for (Integer i : items){
            if(itemCounter.containsKey(i)){
                itemCounter.put(i, itemCounter.get(i) + 1);
            } else{
                itemCounter.put(i, 1);
            }
        }
        return items;
    }

    public Map<Integer, Integer> getItems(){

        return itemCounter;
    }
}
