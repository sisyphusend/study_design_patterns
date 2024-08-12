package structure.composite.demo2;

public class ImageFile extends AbstractFile {


    public ImageFile(String name){
        super(name);
    }

    public void killVirus(){
        System.out.println("--对图像文件--" + this.getName() + "进行杀毒");
    }
}
