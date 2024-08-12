package structure.bridge.demo03.sender;

public class WechatSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("微信通知:" + message);
    }
}
