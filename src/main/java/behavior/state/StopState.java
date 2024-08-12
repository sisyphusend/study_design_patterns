package behavior.state;

/*
* 视频停止状态可以切换到播放，不能切换到快进和暂停
* */

public class StopState extends VideoState{
    @Override
    public void play() {
        super.videoContext.setCurrentVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("停止状态不能暂停");
    }

    @Override
    public void speed() {
        System.out.println("停止状态不能加速");
    }

    @Override
    public void stop() {
        System.out.println("已经处以停止状态");
    }
}
