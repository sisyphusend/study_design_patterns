package behavior.nullobject.demo1;

/*
* 空对象是为了避免空指针异常
*
* 例子 JDK 8 中的 Optional 对象
* */

public class Client {
    public static void main(String[] args) {
        System.out.println(CustomerFactory.getCustomer("aaa").getName());
        System.out.println(CustomerFactory.getCustomer("abc").getName());
    }

}
