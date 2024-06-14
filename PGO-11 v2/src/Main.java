import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "elecrtic guitar"));
        itemList.add(new Item(2, "acustic guitar"));
        itemList.add(new Item(3, "drums"));
        itemList.add(new Item(4, "violin"));
        itemList.add(new Item(5, "piano"));
        itemList.add(new Item(6, "saxophone"));
        itemList.add(new Item(7, "trumpet"));
        itemList.add(new Item(8, "flute"));
        itemList.add(new Item(9, "clarinet"));
        itemList.add(new Item(10, "bass guitar"));

        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getIdNumber(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Item Name: " + entry.getValue());

        }
        List<Item> firstFiveItems = itemList.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);
        System.out.println("First five items in HashSet:");
        for (Item item : itemSet) {
            System.out.println("Item ID: " + item.getIdNumber() + ", Item Name: " + item.getName());
        }
    }
}