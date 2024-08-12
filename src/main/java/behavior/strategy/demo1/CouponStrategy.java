package behavior.strategy.demo1;

public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠劵抵扣");
    }
}
