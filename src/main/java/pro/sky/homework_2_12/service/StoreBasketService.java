package pro.sky.homework_2_12.service;

import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework_2_12.entity.Basket;

import java.util.List;
import java.util.Map;

public interface StoreBasketService {


    List<Integer> addItem(List<Integer> items);

    Map<Integer, Integer> getItems();
}
