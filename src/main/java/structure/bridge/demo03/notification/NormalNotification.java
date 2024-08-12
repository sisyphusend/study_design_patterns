package structure.bridge.demo03.notification;

import structure.bridge.demo03.sender.SmsSender;

public class NormalNotification extends Notification{
    public NormalNotification(SmsSender sender) {
        super(sender);
    }
}
