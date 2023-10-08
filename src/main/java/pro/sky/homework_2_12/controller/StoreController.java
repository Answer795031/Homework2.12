package pro.sky.homework_2_12.controller;

import pro.sky.homework_2_12.entity.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_12.service.StoreService;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final StoreService storeService;
    public StoreController(StoreService storeService){
        this.storeService = storeService;
    }

    @GetMapping
    public String itemList(){
        return storeService.itemList();
    }

    @GetMapping(path = "/add") // /store/order/add?itemName=Pineapple&itemId=12
    public Item addItem(@RequestParam("itemName") String itemName,
                        @RequestParam("itemId") int itemId) {
        return storeService.addItem(itemName, itemId);
    }

    @GetMapping(path = "/get")
    public Item getItems(){
        return storeService.getItems();
    }
}
