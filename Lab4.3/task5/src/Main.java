import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);

            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        root.execute();

        System.out.println("----- DFS -----");
        Iterator<Component> dfs = new DepthFirstIterator(root);
        Item minItem = null;
        Item maxItem = null;

        while (dfs.hasNext()) {
            Component component = dfs.next();
            System.out.println(component);

            if (component instanceof Item) {
                Item item = (Item) component;
                if (minItem == null || item.getValue() < minItem.getValue()) {
                    minItem = item;
                }
                if (maxItem == null || item.getValue() > maxItem.getValue()) {
                    maxItem = item;
                }
            }
        }

        System.out.println("Cheapest item: " + minItem);
        System.out.println("Most expensive item: " + maxItem);

        System.out.println("----- BFS -----");
        Iterator<Component> bfs = new BreadthFirstIterator(root);
        while (bfs.hasNext()) {
            System.out.println(bfs.next());
        }
    }
}