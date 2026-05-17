public class SalaryIncreaseVisitor implements EmployeeVisitor {

    private final int percent;

    public SalaryIncreaseVisitor(int percent) {
        this.percent = percent;
    }

    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() + manager.getSalary() * percent / 100);
    }

    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() + salesPerson.getSalary() * percent / 100);
    }

    public void visit(ITSupport itSupport) {
        itSupport.setSalary(itSupport.getSalary() + itSupport.getSalary() * percent / 100);
    }
}