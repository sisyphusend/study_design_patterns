package behavior.observer.demo2;
/*
这个示例代码太烂了
重新写一下：需求
*/
public class Client {
    public static void main(String[] args) {
        EventListener listener = new MouseEventListener();
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,listener);
        mouse.addListener(MouseEventType.ON_DOUBLE_CLICK,listener);

        mouse.click();
        mouse.doubleClick();

    }
}
