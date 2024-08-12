package creation.singleton;


// 懒加载 还是存在线程安全问题
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){

    }
    synchronized public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return  instance;
    }
}
