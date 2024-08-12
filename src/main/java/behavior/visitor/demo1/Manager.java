package behavior.visitor.demo1;

import java.util.Random;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProduct(){
        return new Random().nextInt(10);
    }
}
