package structure.bridge.demo03;

import structure.bridge.demo03.notification.SevereNotification;
import structure.bridge.demo03.sender.TelephoneSender;

public class Client {
    public static void main(String[] args) {
        SevereNotification severeNotification = new SevereNotification(new TelephoneSender());
        severeNotification.notify("api挂了");
    }
}
