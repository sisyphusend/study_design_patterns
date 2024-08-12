package behavior.state;

public class PauseState extends VideoState{
    @Override
    public void play() {
        super.videoContext.setCurrentVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
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
