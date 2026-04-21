public class ExpensesClient {
    public static void main(String[] args) {
        Manager director = new Manager("Director", 5000);

        Manager manager1 = new Manager("Manager of meat department", 3000);
        Manager manager2 = new Manager("Manager of dairy department", 3000);
        Manager manager3 = new Manager("Manager of bakery department", 3000);

        Salesperson seller11 = new Salesperson("Meat seller 1", 1200, manager1);
        Salesperson seller12 = new Salesperson("Meat seller 2", 1200, manager1);
        Salesperson seller13 = new Salesperson("Meat seller 3", 1200, manager1);

        Salesperson seller21 = new Salesperson("Dairy seller 1", 1100, manager2);
        Salesperson seller22 = new Salesperson("Dairy seller 2", 1100, manager2);
        Salesperson seller23 = new Salesperson("Dairy seller 3", 1100, manager2);

        Salesperson seller31 = new Salesperson("Bakery seller 1", 1150, manager3);
        Salesperson seller32 = new Salesperson("Bakery seller 2", 1150, manager3);
        Salesperson seller33 = new Salesperson("Bakery seller 3", 1150, manager3);

        SalesTeam meatDepartment = new SalesTeam();
        meatDepartment.addManager(manager1);
        meatDepartment.addSalesperson(seller11);
        meatDepartment.addSalesperson(seller12);
        meatDepartment.addSalesperson(seller13);

        SalesTeam dairyDepartment = new SalesTeam();
        dairyDepartment.addManager(manager2);
        dairyDepartment.addSalesperson(seller21);
        dairyDepartment.addSalesperson(seller22);
        dairyDepartment.addSalesperson(seller23);

        SalesTeam bakeryDepartment = new SalesTeam();
        bakeryDepartment.addManager(manager3);
        bakeryDepartment.addSalesperson(seller31);
        bakeryDepartment.addSalesperson(seller32);
        bakeryDepartment.addSalesperson(seller33);

        SalesTeam supermarket = new SalesTeam();
        supermarket.addManager(director);
        supermarket.addSalesperson(new Salesperson("Temporary worker 1", 1000, director));
        supermarket.addSalesperson(new Salesperson("Temporary worker 2", 1000, director));

        payManager(director);
        paySalesperson(seller11);
        payTeam(meatDepartment);
        payTeam(dairyDepartment);
        payTeam(bakeryDepartment);
        }

    private static void payManager(Manager manager) {
        System.out.println("Expenses have been requested");
        manager.payExpenses();
        System.out.println("Expenses have been paid\n");
    }

    private static void paySalesperson(Salesperson salesperson) {
        System.out.println("Expenses have been requested");
        salesperson.payExpenses();
        System.out.println("Expenses have been paid\n");
    }

    private static void payTeam(SalesTeam team) {
        System.out.println("Expenses have been requested");
        team.payExpenses();
        System.out.println("Expenses have been paid\n");
    }
}