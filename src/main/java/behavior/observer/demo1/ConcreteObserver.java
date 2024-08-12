package behavior.observer.demo1;

public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(E event) {
        System.out.println( this +" receive event:" + event);
    }
}
