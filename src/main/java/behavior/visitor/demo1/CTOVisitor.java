package behavior.visitor.demo1;

public class CTOVisitor implements IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师： " + engineer.name + ", KPI: " + engineer.kpi + ", 代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理： " + manager.name + ", KPI: " + manager.kpi );
    }
}
