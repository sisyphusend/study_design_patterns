package behavior.visitor.demo1;

public abstract class Employee {
    public String name;
    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = (int)(Math.random()*100);
    }

    public abstract void accept(IVisitor visitor);
}
