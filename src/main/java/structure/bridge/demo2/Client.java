package structure.bridge.demo2;

public class Client {
    public static void main(String[] args) {
        AbstractMessage abstractMessage = new NomalMessage(new SmsMessage());
        abstractMessage.sendMessage("加班审批","蟹老板");
        abstractMessage = new UrgencyMessage(new EmailMessage());
        abstractMessage.sendMessage("加班审批","蟹老板");
    }
}
