package principle.dip.example2;

public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        Icar benz = new Benz();
        Icar BMW = new BMW();
        driver.drive(benz);
        driver.drive(BMW);
    }
}
