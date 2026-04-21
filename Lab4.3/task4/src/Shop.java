import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Shop implements Iterable<ShopItem> {
    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    public Map<String, ShopItem> getItems() {
        return items;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return new ShopAlphabetIterator(items);
    }

    public Iterator<ShopItem> quantityIterator() {
        return new ShopQuantityIterator(items);
    }
}