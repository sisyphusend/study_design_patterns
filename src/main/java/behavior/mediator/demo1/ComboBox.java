package behavior.mediator.demo1;

public class ComboBox extends Component{
    @Override
    public void update() {
        System.out.println("组合框增加一项");
    }
    public void select(){
        System.out.println("组合框选择一项");
    }
}
