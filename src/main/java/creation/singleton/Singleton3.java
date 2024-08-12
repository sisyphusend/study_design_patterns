package creation.singleton;

/*
* 饿汉式单例类不能实现延迟加载，不管将来用不用，它始终占据内存；懒汉式单例类线程安全控制烦琐，而且性能受影响
* 该方法称为 Initialization on Demand Holder（IoDH）的技术  兼具他们优点
* */
public class Singleton3 {
    private Singleton3(){}
    private static class HolderClass{
        private final static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return HolderClass.instance;
    }
}
