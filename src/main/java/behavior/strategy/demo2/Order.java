package behavior.strategy.demo2;

public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(){
        return null;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("使用" + payment.getName());
        System.out.println("扣款" + amount);
        return payment.pay(uid,amount);
    }
}
