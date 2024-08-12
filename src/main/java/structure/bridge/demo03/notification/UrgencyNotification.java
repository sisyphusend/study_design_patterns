package structure.bridge.demo03.notification;

import structure.bridge.demo03.sender.WechatSender;

public class UrgencyNotification extends Notification{
    public UrgencyNotification(WechatSender wechatSender) {
        super(wechatSender);
    }
}
