package structure.Facade.demo1;

public class NewCipherMachine {
    public String encrypt(String plainText) {
        System.out.println("加密");
        StringBuffer sb = new StringBuffer();
        int key = 10;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += key % 26;
                if (c > 'z') {
                    c -= 26;
                }
            }
            if (c >= 'A' && c <= 'Z') {
                c += key % 26;
                if (c > 'Z') c -= 26;
                if (c < 'A') c += 26;
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
