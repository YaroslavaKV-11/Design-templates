import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ShopQuantityIterator implements Iterator<ShopItem> {
    private final List<ShopItem> items;
    private int position = 0;

    public ShopQuantityIterator(Map<String, ShopItem> items) {
        this.items = new ArrayList<>(items.values());
        this.items.sort(Comparator.comparingInt(ShopItem::getQuantity).reversed());
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public ShopItem next() {
        return items.get(position++);
    }
}