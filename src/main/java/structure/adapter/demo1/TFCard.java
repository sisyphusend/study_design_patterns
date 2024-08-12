package structure.adapter.demo1;

import java.util.Arrays;

public class TFCard {

    private byte[] bytes;

    public TFCard(byte[] bytes) {
        this.bytes = bytes;
    }

    public String readSD(){
        return Arrays.toString(bytes);
    }

    public void writeSD(byte[] data){
        byte[] newBytes = new byte[data.length + bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            newBytes[i] = bytes[i];
        }
        for (int i = 0; i < data.length; i++) {
            newBytes[i + bytes.length - 1] = data[i];
        }
        bytes = newBytes;
    }

}
