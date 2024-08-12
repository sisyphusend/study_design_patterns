package behavior.visitor.demo1;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();

    public BusinessReport(){
        employees.add(new Manager("经理-A"));
        employees.add(new Engineer("工程师-A"));
        employees.add(new Engineer("工程师-B"));
        employees.add(new Engineer("工程师-C"));
        employees.add(new Manager("经理-B"));
        employees.add(new Engineer("工程师-B"));
    }

    public void showReport(IVisitor visitor){
        for(Employee employee:employees){
            employee.accept(visitor);
        }
    }

}
