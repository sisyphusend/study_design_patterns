package structure.composite.demo2;

import structure.composite.demo2.Folder;
import structure.composite.demo2.ImageFile;
import structure.composite.demo2.TextFile;

public abstract class Client {

    public static void main(String[] args) {
        AbstractFile folder1, folder2, folder3, image1, image2, text1, text2,video1,video2;

        folder1 = new Folder("Sunny资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        image1 = new ImageFile("abc.jpg");
        image2 = new ImageFile("dfg.jpg");

        text1 = new TextFile("xxx.txt");
        text2 = new TextFile("yyy.txt");

        video1 = new VideoFile("mmm.avi");
        video2 = new VideoFile("nnn.avi");

        folder1.add(folder2);
        folder1.add(folder3);

        folder1.add(video1);
        folder1.add(video2);

        folder2.add(image1);
        folder2.add(image2);

        folder3.add(text1);
        folder3.add(text2);

        folder1.killVirus();

    }


}
