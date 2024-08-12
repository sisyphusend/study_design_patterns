package structure.Facade.demo1;

public class EncryptFacade extends AbstractEncryptFacade {
    private FileReader fileReader;
    private CipherMachine cipher;
    private FileWriter fileWriter;

    public EncryptFacade(){
        fileReader = new FileReader();
        cipher = new CipherMachine();
        fileWriter = new FileWriter();
    }

    // 对客户端统一开放接口
    public void fileEncrypt(String srcPath,String desPath){
        String plainStr = fileReader.read(srcPath);
        String encryptStr = cipher.encrypt(plainStr);
        fileWriter.write(encryptStr,desPath);
    }

}
