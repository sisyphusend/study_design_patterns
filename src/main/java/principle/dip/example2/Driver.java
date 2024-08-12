package principle.dip.example2;

public class Driver implements IDriver {
    public void drive(Icar car){
        car.run();
    }

}
