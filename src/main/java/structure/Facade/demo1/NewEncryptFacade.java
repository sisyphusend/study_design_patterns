package structure.Facade.demo1;

public class NewEncryptFacade extends AbstractEncryptFacade{

    private FileReader fileReader;
    private NewCipherMachine cipher;
    private FileWriter fileWriter;

    public NewEncryptFacade(){
        fileReader = new FileReader();
        cipher = new NewCipherMachine();
        fileWriter = new FileWriter();
    }
    @Override
    public void fileEncrypt(String srcPath, String desPath) {
        String plainStr = fileReader.read(srcPath);
        String encryptStr = cipher.encrypt(plainStr);
        fileWriter.write(encryptStr,desPath);
    }
}
