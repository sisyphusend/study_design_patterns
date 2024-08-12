package behavior.state;

/*
* 播放可以切换为其他所有
* */
public class PlayState extends VideoState{
    @Override
    public void play() {
        System.out.println("已经处以停止状态");
    }

    @Override
    public void pause() {
        super.videoContext.setCurrentVideoState(VideoContext.PAUSE_STATE);

    }

    @Override
    public void speed() {
        super.videoContext.setCurrentVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setCurrentVideoState(VideoContext.STOP_STATE);
    }
}
