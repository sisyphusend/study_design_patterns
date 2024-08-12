package structure.bridge.demo03.sender;

public class EmailSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("邮件通知:" + message);
    }
}
