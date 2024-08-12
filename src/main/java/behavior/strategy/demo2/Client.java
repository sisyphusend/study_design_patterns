package behavior.strategy.demo2;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("abcde","xxxx",100);
        MsgResult msg = order.pay(PayStrategy.ALI_PAY);
        System.out.println(msg);
    }
}
