package behavior.observer.demo2;

public class MouseEventListener implements EventListener{
    public void onClick(Event e){
        System.out.println("==== 监听到了单击事件 =====" + "\n" + e);
    }

    public void onDoubleClick(Event e){
        System.out.println("==== 监听到了双击事件 =====" + "\n" + e);
    }
}

