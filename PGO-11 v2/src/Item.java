import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Item {
    private int idNumber;
    private String name;

    public Item(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Item name is:" + name);

    }
}
