public class Manager implements Employee {

    private int salary;

    public Manager(int salary) {
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