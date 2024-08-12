package creation.factory.demo1;

public class YellowHuman implements Humans{
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("中文");
    }
}
