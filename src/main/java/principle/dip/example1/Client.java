package principle.dip.example1;

public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Benz benz = new Benz();
        driver.drive(benz);
    }
}
