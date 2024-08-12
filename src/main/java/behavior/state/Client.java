package behavior.state;

/*
* 对象的行为 会改变 对象的状态
* */

public class Client {
    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();
        videoContext.setCurrentVideoState(VideoContext.PLAY_STATE);
        System.out.println("当前视频状态" + videoContext.getCurrentVideoState().getClass().getSimpleName());
        videoContext.pause();
        System.out.println("当前视频状态" + videoContext.getCurrentVideoState().getClass().getSimpleName());
        videoContext.stop();
        System.out.println("当前视频状态" + videoContext.getCurrentVideoState().getClass().getSimpleName());
        videoContext.speed();
        System.out.println("当前视频状态" + videoContext.getCurrentVideoState().getClass().getSimpleName());
    }
}
