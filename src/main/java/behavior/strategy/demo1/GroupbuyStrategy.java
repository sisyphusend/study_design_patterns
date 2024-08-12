package behavior.strategy.demo1;

public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("5人团购，优惠10%");
    }
}
