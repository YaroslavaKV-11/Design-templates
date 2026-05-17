public class SalesPerson implements Employee {

    private int salary;

    public SalesPerson(int salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}