package principle.lsp.example2;

import java.util.HashMap;

public class Client {
    public static void invoker1(){
        Father f = new Father();
        HashMap map = new HashMap<>();
        f.doSomething(map);
    }
    public static void invoker2(){
        Son S = new Son();
        HashMap map = new HashMap<>();
        S.doSomething(map);
    }
    public static void main(String[] args) {
        invoker1();  //调用父类方法
        invoker2();   //调用子类方法  方法搜索路径是  方法名 + 参数对象类型   如果搜索不到  方法名 + 参数对象类型的父类型
        //所以子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或者更宽松。
    }
}
