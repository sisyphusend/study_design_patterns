package structure.composite.demo2;

public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        super(name);
    }

    public void killVirus(){
        System.out.println("--对文本文件--" + this.getName() + "进行杀毒");
    }

}
