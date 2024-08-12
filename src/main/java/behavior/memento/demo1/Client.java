package behavior.memento.demo1;

public class Client {
    public static void main(String[] args) {
        MemtentoCaretaker mc = new MemtentoCaretaker();
        Chessman chess = new Chessman("车",1,1);
        display(chess);
        mc.setMemtento(chess.save());
        chess.setX(5);
        display(chess);
        System.out.println("悔棋");
        chess.restore(mc.getMemtento());
        display(chess);
    }
    public static void display(Chessman chess){
        System.out.printf("棋子 %s  棋子坐标：(%d,%d)\n",chess.getLabel(),chess.getX(),chess.getY());
    }
}
