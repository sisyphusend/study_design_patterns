package structure.bridge.demo03.sender;

public class TelephoneSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("电话通知:" + message);
    }
}
