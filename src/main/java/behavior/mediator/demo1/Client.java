package behavior.mediator.demo1;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;

        addBT.changed();
        System.out.println("-----");
        list.changed();


    }
}
