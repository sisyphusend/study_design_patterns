package structure.flyweight.demo1;

public class Client {
    public static void main(String[] args) {
        IgoChessman black1,black2,black3,white1,white2,white3;
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("黑色棋子是否相同：" + (black1 == black3) );

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        white3 = factory.getIgoChessman("w");
        System.out.println("白色棋子是否相同：" + (white1 == white3) );

        black1.display(new Coordinates(2,4));
        black2.display(new Coordinates(4,4));
        black3.display(new Coordinates(6,4));

        white1.display(new Coordinates(5,9));
        white2.display(new Coordinates(7,9));
        white3.display(new Coordinates(9,9));


    }
}
