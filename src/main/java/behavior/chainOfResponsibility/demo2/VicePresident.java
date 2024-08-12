package behavior.chainOfResponsibility.demo2;



public class VicePresident extends Approver{

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 10000){
            System.out.println(this.getClass().getSimpleName() + "请求通过 ：" + request);
        }else {
            this.successor.processRequest(request);
        }
    }
}
