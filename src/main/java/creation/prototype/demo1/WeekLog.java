package creation.prototype.demo1;

public class WeekLog implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog clone()  {
        Object obj = null;
        try{
            obj = super.clone();
            return (WeekLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }
}
