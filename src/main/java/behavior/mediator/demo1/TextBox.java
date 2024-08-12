package behavior.mediator.demo1;

public class TextBox extends Component{
    @Override
    public void update() {
        System.out.println("文本框 客户信息增加成功，并清空");
    }

    public void setText(){
        System.out.println("文本框显示xxx");
    }
}
