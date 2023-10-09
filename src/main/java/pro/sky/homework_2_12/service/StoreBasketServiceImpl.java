package pro.sky.homework_2_12.service;

import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework_2_12.entity.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreBasketServiceImpl implements StoreBasketService {

    private final Basket basket;
    public StoreBasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> addItem(List<Integer> items){

        return basket.addItem(items);
    }

    public Map<Integer, Integer> getItems(){

        return basket.getItems();
    }
}
