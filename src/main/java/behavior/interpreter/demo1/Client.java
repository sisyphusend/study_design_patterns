package behavior.interpreter.demo1;

/*
* ，Sunny软件公司开发人员使用解释器模式来设计和实现机器人控制程序。针对5条文法规则，分别提供5个类来实现。其中，终结符表达式direction、action和distance对应DirectionNode类、ActionNode类和DistanceNode类，非终结符表达式expression和composite对应SentenceNode类和AndNode类。
可以通过抽象语法树来表示具体解释过程，例如机器人控制指令“down run 10 and left move 20”
* */

public class Client {
    public static void main(String[] args) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }

}
