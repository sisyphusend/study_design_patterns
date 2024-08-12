package structure.composite.demo2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{

    private List<AbstractFile> child = new ArrayList<AbstractFile>();

    public Folder(String name){
        super(name);
    }


    @Override
    public  void  add(AbstractFile file){
        child.add(file);
    };

    @Override
    public  void  remove(AbstractFile file){

    };

    @Override
    public  AbstractFile  getChild(int i){
        return child.get(i);
    };

    @Override
    public void killVirus() {
        for(AbstractFile file:child){
                file.killVirus();
        }
    }
}
