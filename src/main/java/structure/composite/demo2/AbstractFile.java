package structure.composite.demo2;

public abstract class AbstractFile {

    private String name;

    public AbstractFile(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  add(AbstractFile file){

    };
    public  void  remove(AbstractFile file){

    };
    public  AbstractFile  getChild(int i){
        return null;
    };
    public abstract void  killVirus();
}
