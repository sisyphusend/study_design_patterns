package structure.Facade.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String path){
        System.out.println("读取文件");
        StringBuffer sb = new StringBuffer();
        try{
            FileInputStream inFS = new FileInputStream(path);
            int data;
            while((data = inFS.read()) != -1){
                sb.append((char)data);
            }
            inFS.close();
            System.out.println(sb);

        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件操作错误");
        }
        return sb.toString();
    }
}
