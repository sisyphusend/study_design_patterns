package behavior.chainOfResponsibility.demo2;



public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 5000){
            System.out.println(this.getClass().getSimpleName() + "通过了请求 ：" + request);
        }else {
            this.successor.processRequest(request);
        }
    }
}
