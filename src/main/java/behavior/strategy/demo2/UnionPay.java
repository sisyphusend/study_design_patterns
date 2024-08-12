package behavior.strategy.demo2;

public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(String uid) {
        return 10;
    }
}
