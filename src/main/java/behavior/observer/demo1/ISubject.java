package behavior.observer.demo1;
/*
* 被观察者的抽象接口
* */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);
    boolean detach(IObserver<E> observer);
    void notify(E event);
}
