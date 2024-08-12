package behavior.strategy.demo2;

public class WechatPay extends Payment{
    @Override
    public String getName() {
        return null;
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
