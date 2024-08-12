package behavior.templatemethod.demo1;

public class JavaCourse extends AbastractCourse {
    @Override
    protected boolean needCheckHomework() {
        return true;

    }

    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }


}
