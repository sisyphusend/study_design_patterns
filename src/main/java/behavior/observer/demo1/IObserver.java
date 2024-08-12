package behavior.observer.demo1;

/*
* 观察者
* */
public interface IObserver<E> {
    void update(E event);
}
