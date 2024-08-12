package behavior.command.demo1;

public class Client {
    public static void main(String[] args) {
        FBSettingWindow w = new FBSettingWindow("功能键设置");
        FunctionButton fb1,fb2;
        fb1  = new FunctionButton("功能键1");
        fb2  = new FunctionButton("功能键2");

        Command command1 = new HelpCommand(new HelpHandler());
        Command command2 = new MinimizeCommand(new WindowHandler());

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        w.addFunctionButton(fb1);
        w.addFunctionButton(fb2);

        w.display();

        fb1.onClick();
        fb2.onClick();


    }
}
