package structure.bridge.demo03.notification;

import structure.bridge.demo03.sender.Sender;

public class Notification {
    private Sender sender;

    public Notification(Sender sender) {
        this.sender = sender;
    }

    public void notify(String message){
        sender.send(message);
        }
}
