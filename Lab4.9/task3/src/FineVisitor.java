public class FineVisitor implements EmployeeVisitor {

    private final int fine;

    public FineVisitor(int fine) {
        this.fine = fine;
    }

    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() - fine);
    }

    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() - fine);
    }

    public void visit(ITSupport itSupport) {
        itSupport.setSalary(itSupport.getSalary() - fine);
    }
}