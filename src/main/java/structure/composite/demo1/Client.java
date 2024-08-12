package structure.composite.demo1;

/*
* Folder类的缺陷是 文件夹和文件要分别处理
* */

public class Client {

    public static void main(String[] args) {
        Folder folder1,folder2,folder3;
        folder1 = new Folder("Sunny资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        ImageFile image1,image2;
        image1 = new ImageFile("abc.jpg");
        image2 = new ImageFile("dfg.jpg");

        TextFile text1,text2;
        text1 = new TextFile("xxx.txt");
        text2 = new TextFile("yyy.txt");

        folder2.addImageFile(image1);
        folder2.addImageFile(image2);

        folder3.addTextFile(text1);
        folder3.addTextFile(text2);

        folder1.addFolder(folder2);
        folder1.addFolder(folder3);

        folder1.killVirus();

    }

}
