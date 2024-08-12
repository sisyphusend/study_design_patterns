package creation.factory.demo1;

public interface AbstractHumanFactory {
    public abstract <T extends Humans> T createHumans(Class<T> C) throws ClassNotFoundException, InstantiationException, IllegalAccessException;
}
