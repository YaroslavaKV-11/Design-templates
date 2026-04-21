import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Employee {
    private final List<Employee> employees = new ArrayList<>();

    void addManager(Manager manager) {
        employees.add(manager);
    }

    void addSalesperson(Salesperson salesperson) {
        employees.add(salesperson);
    }

    @Override
    public void payExpenses() {
        for (Employee employee : employees) {
            employee.payExpenses();
        }
    }
}