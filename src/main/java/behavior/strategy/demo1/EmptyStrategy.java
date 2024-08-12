package behavior.strategy.demo1;

public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
