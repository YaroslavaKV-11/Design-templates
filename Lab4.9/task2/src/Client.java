public class Client {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.add(new Bread());
        groceryList.add(new Bread());
        groceryList.add(new Milk());
        groceryList.add(new Coffee());

        System.out.println("Total price of grocery list: " + groceryList.getPrice());

        groceryList.accept(new DiscountVisitor(0.1));

        System.out.println("Total price with discount: " + groceryList.getPrice());

        groceryList.accept(new PriceIncreaseVisitor(0.5, 1, 1.5));

        System.out.println("Total price after price increase: " + groceryList.getPrice());
    }
}