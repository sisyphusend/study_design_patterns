package behavior.memento.demo2;

public class Client {
    public static void main(String[] args) {
        MemtentoCaretaker mc = new MemtentoCaretaker(5);
        Chessman chess = new Chessman("车",1,1);
        mc.setMemtento(chess.save());
        display(chess);

        chess.setX(5);
        mc.setMemtento(chess.save());
        display(chess);

        chess.setY(10);
        mc.setMemtento(chess.save());
        display(chess);

        chess.setY(15);
        mc.setMemtento(chess.save());
        display(chess);


        System.out.println("悔棋");
        chess.restore(mc.getMemtento());
        display(chess);

        System.out.println("悔棋");
        chess.restore(mc.getMemtento());
        display(chess);

        System.out.println("悔棋");
        chess.restore(mc.getMemtento());
        display(chess);
    }
    public static void display(Chessman chess){
        System.out.printf("棋子 %s  棋子坐标：(%d,%d)\n",chess.getLabel(),chess.getX(),chess.getY());
    }
}
