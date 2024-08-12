package behavior.strategy.demo2;

public abstract class Payment {
    public abstract String getName();
    public MsgResult pay(String uid,double amount){
        if(queryBalance(uid)<amount){
            return new MsgResult(400,"支付失败","余额不足");
        }

        return new MsgResult(400,"支付成功",String.valueOf(amount));
    }

    protected abstract double queryBalance(String uid);
}
