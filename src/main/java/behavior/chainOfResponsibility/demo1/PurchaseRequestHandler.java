package behavior.chainOfResponsibility.demo1;

/*
* 采购请求
* 主任可以审批5万元以下（不包括5万元）的采购单，
* 副董事长可以审批5万～10万元（不包括10万元）的采购单，
* 董事长可以审批10万～50万元（不包括50万元）的采购单，
* 50万元及以上的采购单就需要开董事会讨论决定。
* */
public class PurchaseRequestHandler {
    public void sendRequestToDirector(PurchaseRequest request){
        if(request.getAmount() < 5000){
            this.handleByDirector(request);
        } else if (request.getAmount() < 10000) {
            this.handleByVicePresident(request);
        }else if (request.getAmount() < 50000) {
            this.handleByPresident(request);
        }else {
            this.handleByCongress(request);
        }
    }
    public  void  handleByDirector(PurchaseRequest request){

    }

    public  void  handleByVicePresident(PurchaseRequest request){

    }

    public  void  handleByPresident(PurchaseRequest request){

    }

    public  void  handleByCongress(PurchaseRequest request){

    }
}
