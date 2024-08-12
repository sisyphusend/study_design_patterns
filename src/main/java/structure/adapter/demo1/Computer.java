package structure.adapter.demo1;

/*
* 电脑类只适配SDCard ，不适配TFCard
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Computer {

   Map<String,SDCard> sdCardMap = new HashMap<String,SDCard>();

    public void addCard(String name,SDCard sdCard){
        sdCardMap.put(name,sdCard);
    }

    public void remoteCard(String name){
        sdCardMap.remove(name);
    }

    public String read(String name){
        if(sdCardMap.get(name) == null){
            throw new NullPointerException("sd card is null");
        }

        return   sdCardMap.get(name).readSD();
    }

    public void write(String name,String data){
        if(sdCardMap.get(name) == null){
            throw new NullPointerException("sd card is null");
        }

        sdCardMap.get(name).writeSD(data);
    }

}
