package behavior.chainOfResponsibility.demo2;

/*
*
* */

public class Client {
    public static void main(String[] args) {
        Approver x,y,z,k;
        x = new Director("x");
        y = new VicePresident("y");
        z = new President("z");
        k = new Congress("k");

        x.setSuccessor(y);
        y.setSuccessor(z);
        z.setSuccessor(k);

        PurchaseRequest p1 = new PurchaseRequest(1000000,1001,"buy car");
        x.processRequest(p1);

        PurchaseRequest p2 = new PurchaseRequest(1000,1001,"eat");
        x.processRequest(p2);

        PurchaseRequest p3 = new PurchaseRequest(100000,1001,"xxx");
        x.processRequest(p3);


    }
}
