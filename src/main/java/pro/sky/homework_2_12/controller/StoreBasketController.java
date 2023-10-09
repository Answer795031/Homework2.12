package pro.sky.homework_2_12.controller;

import pro.sky.homework_2_12.entity.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_12.service.StoreBasketService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class StoreBasketController {

    private final StoreBasketService storeBasketService;
    public StoreBasketController(StoreBasketService storeBasketService){
        this.storeBasketService = storeBasketService;
    }

    // добавление в корзину
    @GetMapping(path = "/add") // /store/order/add?itemId=12
    public List<Integer> addItem(@RequestParam("itemId")List<Integer> items) {
        return storeBasketService.addItem(items);
    }

    // показать корзину
    @GetMapping(path = "/get")
    public Map<Integer, Integer> getItems(){
        return storeBasketService.getItems();
    }
}
