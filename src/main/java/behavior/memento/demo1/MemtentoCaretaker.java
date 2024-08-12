package behavior.memento.demo1;

public class MemtentoCaretaker {
    private ChessmanMemtento memtento;

    public ChessmanMemtento getMemtento() {
        return memtento;
    }

    public void setMemtento(ChessmanMemtento memtento) {
        this.memtento = memtento;
    }
}
