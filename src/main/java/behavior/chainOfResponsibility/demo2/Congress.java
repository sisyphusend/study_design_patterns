package behavior.chainOfResponsibility.demo2;



public class Congress extends Approver{

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println(this.getClass().getSimpleName() + "通过了请求 ：" + request);
    }
}
