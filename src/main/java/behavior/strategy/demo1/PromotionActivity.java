package behavior.strategy.demo1;

public class PromotionActivity {
    private PromotionStrategy strategy;

    public PromotionStrategy getStrategy() {
        return strategy;
    }

    public PromotionActivity(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
