package behavior.command.demo1;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button){
        functionButtons.add(button);
    }

    public void remoteFunctionButton(FunctionButton button){
        functionButtons.remove(button);
    }

    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for(FunctionButton button : functionButtons){
            System.out.println(button.getName());
        }
        System.out.println("------------");
    }



}
