package structure.composite.demo1;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> folderList = new ArrayList<Folder>();
    private ArrayList<ImageFile> imageFileList = new ArrayList<ImageFile>();
    private ArrayList<TextFile> textFileList = new ArrayList<TextFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder f){
        folderList.add(f);
    }

    public void addImageFile(ImageFile f){
        imageFileList.add(f);
    }

    public void addTextFile(TextFile f){
        textFileList.add(f);
    }

    public void killVirus(){

        for(Object obj : folderList ){
           ((Folder)obj).killVirus();
        }

        for(Object obj : imageFileList ){
            ((ImageFile)obj).killVirus();
        }

        for(Object obj : textFileList ){
            ((TextFile)obj).killVirus();
        }

    }

}
