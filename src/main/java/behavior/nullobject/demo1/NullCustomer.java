package behavior.nullobject.demo1;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isnull() {
        return true;
    }

    @Override
    public String getName() {
        return "空对象";
    }
}
