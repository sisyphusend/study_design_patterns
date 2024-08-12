package behavior.command.demo1;

public class MinimizeCommand extends Command{

    private WindowHandler windowHandler;



    public MinimizeCommand(WindowHandler windowHandler){
        this.windowHandler = windowHandler;
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
