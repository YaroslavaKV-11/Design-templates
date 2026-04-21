public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new SugarDecorator(beverage1);
        beverage1 = new SugarDecorator(beverage1);
        System.out.println(beverage1);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new CreamDecorator(beverage2);
        beverage2 = new SugarDecorator(beverage2);
        beverage2 = new SugarDecorator(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new DarkRoast();
        beverage3 = new CremeDecorator(beverage3);
        beverage3 = new SugarDecorator(beverage3);
        System.out.println(beverage3);

        Beverage beverage4 = new Decaf();
        beverage4 = new MilkDecorator(beverage4);
        beverage4 = new SugarDecorator(beverage4);
        beverage4 = new SugarDecorator(beverage4);
        System.out.println(beverage4);
    }
}