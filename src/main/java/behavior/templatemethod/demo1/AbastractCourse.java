package behavior.templatemethod.demo1;

public abstract class AbastractCourse {
    public final void createCourse() {
        postPreResource();
        createPPT();
        liveVideo();
        postResoure();
        postHomework();
        if (needCheckHomework()) {
            checkHomework();
        }

    }

    protected void postPreResource() {
        System.out.println("发布预习资料");
    }

    protected void createPPT() {
        System.out.println("制作课件");
    }

    protected void liveVideo() {
        System.out.println("直播");
    }

    protected void postResoure() {
        System.out.println("上传课后资料");
    }

    protected void postHomework() {
        System.out.println("布置课后作业");
    }

    protected  void checkHomework(){
        System.out.println("检查作业");
    };

    protected boolean needCheckHomework() {
        return false;
    }
}
