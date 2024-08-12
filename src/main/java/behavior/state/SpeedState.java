package behavior.state;

public class SpeedState extends VideoState{
    @Override
    public void play() {
        super.videoContext.setCurrentVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        super.videoContext.setCurrentVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void speed() {

    }

    @Override
    public void stop() {
        super.videoContext.setCurrentVideoState(VideoContext.STOP_STATE);
    }
}
