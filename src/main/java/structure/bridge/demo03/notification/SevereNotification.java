package structure.bridge.demo03.notification;

import structure.bridge.demo03.sender.TelephoneSender;

public class SevereNotification extends Notification{
    public SevereNotification(TelephoneSender telephoneSender) {
        super(telephoneSender);
    }
}
