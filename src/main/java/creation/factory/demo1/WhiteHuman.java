package creation.factory.demo1;

public class WhiteHuman implements Humans{
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白人英语");
    }
}
