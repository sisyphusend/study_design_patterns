package behavior.visitor.demo1;

public interface IVisitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
