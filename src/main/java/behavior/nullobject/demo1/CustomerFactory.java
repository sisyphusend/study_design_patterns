package behavior.nullobject.demo1;

public class CustomerFactory {
    public final static String[] names ={"aaa","bbb","ccc","ddd"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if(name.equals(names[i])){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
