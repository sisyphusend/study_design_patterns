package structure.bridge.demo03.notification;

import structure.bridge.demo03.sender.EmailSender;

public class TrivalNotification extends Notification{
    public TrivalNotification(EmailSender sender) {
        super(sender);
    }
}
