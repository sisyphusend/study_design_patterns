package behavior.memento.demo1;

public class Chessman {
    private String label;
    private int x;
    private int y;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMemtento save(){
        return new ChessmanMemtento(this.label,this.x,this.y);
    }
    public void restore(ChessmanMemtento memtento){
        this.label = memtento.getLabel();
        this.x = memtento.getX();
        this.y = memtento.getY();
    }
}
