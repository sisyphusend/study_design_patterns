package behavior.strategy.demo1;

public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到银行卡");
    }
}
