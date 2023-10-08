package pro.sky.homework_2_12.entity;

import java.util.Objects;

public class Item {

    private final String itemName;
    private final int itemId;

    public Item(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "Store{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemId == item.itemId && Objects.equals(itemName, item.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemId);
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }
}
