package behavior.strategy.demo2;

public class JDPay extends Payment{
    @Override
    public String getName() {
        return "白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
