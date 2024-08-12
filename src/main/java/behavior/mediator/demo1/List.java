package behavior.mediator.demo1;

public class List extends Component{
    @Override
    public void update() {
        System.out.println("列表框增加了一项");
    }
    public void select(){
        System.out.println("列表框选择了一项");
    }
}
