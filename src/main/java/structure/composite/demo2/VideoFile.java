package structure.composite.demo2;

public class VideoFile extends AbstractFile{

    public VideoFile(String name) {
        super(name);
    }


    @Override
    public void killVirus() {
        System.out.println("--对视频文件--" + this.getName() + "进行杀毒");
    }
}
