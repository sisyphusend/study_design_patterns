package behavior.observer.demo2;

public enum MouseEventType implements EventType{
    ON_CLICK("click"),ON_DOUBLE_CLICK("doubleClick");
    private String name;
    MouseEventType(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
