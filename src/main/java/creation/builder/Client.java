package creation.builder;

public class Client {
    //test
    public static void main(String[] args) {
        RabbitMQClient rabbitMQClient = new RabbitMQClient.Builder().
                setHost("192.168.52.123").
                setMode(2).setExchange("text-exchange").
                setPort(5672).
                setDurable(true).
                build();
    }
}
