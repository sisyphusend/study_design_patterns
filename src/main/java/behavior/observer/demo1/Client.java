package behavior.observer.demo1;

public class Client {
    public static void main(String[] args) {
        //被观察者 ，发布者
        ISubject<String> observable = new ConcreteSubject<>();
        // 观察者，订阅者
        IObserver<String> observer1 = new ConcreteObserver<>();
        IObserver<String> observer2 = new ConcreteObserver<>();

        // 注册
        observable.attach(observer1);
        observable.attach(observer2);

        // 通知
        observable.notify("起床");

    }
}
