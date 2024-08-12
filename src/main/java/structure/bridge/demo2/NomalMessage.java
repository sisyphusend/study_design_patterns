package structure.bridge.demo2;

public class NomalMessage extends AbstractMessage{

    public NomalMessage(IMessage message) {
        super(message);
    }

    public void sendMessage(String message, String toUser){
        super.sendMessage(message,toUser);
    }
}
