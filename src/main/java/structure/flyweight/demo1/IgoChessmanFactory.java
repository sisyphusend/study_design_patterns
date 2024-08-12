package structure.flyweight.demo1;

import java.util.Hashtable;

public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;

    private IgoChessmanFactory(){
        ht = new Hashtable<>();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public  IgoChessman getIgoChessman(String color){
        return (IgoChessman) ht.get(color);
    }

}
