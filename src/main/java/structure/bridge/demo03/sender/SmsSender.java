package structure.bridge.demo03.sender;

public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("短信通知:" + message);
    }
}
