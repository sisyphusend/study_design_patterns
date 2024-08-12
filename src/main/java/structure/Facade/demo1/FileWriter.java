package structure.Facade.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String s,String path){
        System.out.println("写文件");
        try{
        FileOutputStream onFS = new FileOutputStream(path);
        onFS.write(s.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
