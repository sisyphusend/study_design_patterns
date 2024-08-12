package behavior.observer.demo2;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class EventContext {
    protected Map<EventType,Event> events = new HashMap<EventType,Event>();
    public void addListener(EventType eventType, EventListener target, Method callback){
        events.put(eventType,new Event(target,callback));
    }

    public void addListener(EventType eventType,EventListener target){
        try{
            this.addListener(eventType, target,target.getClass().getMethod("on" + toUpperFirstCase(eventType.getName()),Event.class));
        }catch (NoSuchMethodException e){
            return;
        }
    }

    private String toUpperFirstCase(String eventType){
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try{
            if(event.getCallback() != null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void trigger(EventType eventType){
        if(! this.events.containsKey(eventType)){return;};
        trigger(this.events.get(eventType));
    }

}
