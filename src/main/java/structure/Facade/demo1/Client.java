package structure.Facade.demo1;

/*
* EncryptFacade充当外观类，FileReader、CipherMachine和FileWriter充当子系统类
* 跟换加密模块 添加一个抽象模块类
* */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("E:\\test\\1\\merge.txt","E:\\test\\1\\encrypt.txt");

        // 跟换加密模块
        NewEncryptFacade newencryptFacade = new NewEncryptFacade();
        newencryptFacade.fileEncrypt("E:\\test\\1\\merge.txt","E:\\test\\1\\encrypt.txt");
    }
}
