package behavior.observer.demo2;

import java.lang.reflect.Method;

public class Event {
    // 事件的发起者
    private Object source;
    // 监听对象
    private EventListener target;
    // 事件触发的回调函数
    private Method callback;

    //
    private long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public EventListener getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", time=" + time +
                '}';
    }
}
