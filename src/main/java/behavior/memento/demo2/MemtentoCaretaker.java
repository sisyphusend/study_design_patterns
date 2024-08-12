package behavior.memento.demo2;

import java.util.LinkedList;

public class MemtentoCaretaker {
    // 添加多次撤销的功能  可以撤销有有限次 ,可以回复操作
    private LinkedList<ChessmanMemtento> list;
    private int size;


    public MemtentoCaretaker(int size){
        list = new LinkedList<ChessmanMemtento>();
        this.size = size;
    }
    public ChessmanMemtento getMemtento() {
         return  list.removeLast();
    }

    public void setMemtento(ChessmanMemtento memtento) {
        if(list.size() == size){
            list.removeFirst();
            list.add(memtento);
        }
        list.add(memtento);
    }
}
