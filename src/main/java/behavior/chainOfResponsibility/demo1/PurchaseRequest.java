package behavior.chainOfResponsibility.demo1;

public class PurchaseRequest {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public PurchaseRequest(int amount) {
        this.amount = amount;
    }
}
