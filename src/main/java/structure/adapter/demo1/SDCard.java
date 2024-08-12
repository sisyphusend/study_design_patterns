package structure.adapter.demo1;

public class SDCard {

    private StringBuffer sb = new StringBuffer();

    public SDCard(){
    }
    public SDCard(String data){
        sb.append(data);
    }

    public String readSD(){
        return sb.toString();
    }

    public void writeSD(String data){
        sb.append(data);
    }
}
