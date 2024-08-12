package structure.bridge.demo2;

public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    public void sendMessage(String message, String toUser){
        message = "加急："  + message;
        super.sendMessage(message,toUser);
    }
}
