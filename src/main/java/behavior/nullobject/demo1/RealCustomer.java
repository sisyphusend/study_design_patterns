package behavior.nullobject.demo1;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }
    @Override
    public boolean isnull() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
