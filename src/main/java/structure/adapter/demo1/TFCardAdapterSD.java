package structure.adapter.demo1;

public class TFCardAdapterSD extends  SDCard{

    private TFCard tfCard;

    public TFCardAdapterSD(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD(){
        return tfCard.readSD();
    }

    public void writeSD(String data){
        tfCard.writeSD(data.getBytes());
    }

}
