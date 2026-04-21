import java.util.ArrayList;
import java.util.List;

public class StaffList implements Iterable<Employee> {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public java.util.Iterator<Employee> iterator() {
        return new StaffListIterator(employees);
    }
}