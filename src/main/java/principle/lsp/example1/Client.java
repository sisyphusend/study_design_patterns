package principle.lsp.example1;

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
//        invoker1();  //调用父类方法
        invoker2();   //调用父类方法  方法搜索路径是  方法名相同 + 参数对象类型相同   如果搜索不到  方法名相同 + 传入参数对象类型的父类型与类方法相同
    }
}
