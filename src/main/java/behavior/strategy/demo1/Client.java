package behavior.strategy.demo1;

public class Client {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CashbackStrategy());
        promotionActivity.execute();
    }
}
