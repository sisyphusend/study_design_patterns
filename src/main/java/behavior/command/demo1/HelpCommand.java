package behavior.command.demo1;

public class HelpCommand extends Command{

    private HelpHandler helpHandler;

    public HelpCommand(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
