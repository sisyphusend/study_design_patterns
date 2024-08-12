package creation.prototype.demo1;

public class Client {
    public static void main(String[] args) {
        WeekLog log_previous = new WeekLog();
        log_previous.setDate("2023-02-10");
        log_previous.setContent("xxxxx");

        WeekLog log_new = log_previous.clone();
        System.out.println(log_new.getContent());
    }
}
