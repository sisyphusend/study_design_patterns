package structure.Facade.demo1;

public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("加密");
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < plainText.length();i++){
            sb.append(plainText.charAt(i)%7);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
