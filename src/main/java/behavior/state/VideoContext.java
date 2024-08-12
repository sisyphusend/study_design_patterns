package behavior.state;

public class VideoContext {

    private VideoState currentVideoState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static StopState STOP_STATE = new StopState();

    public VideoState getCurrentVideoState(){
        return currentVideoState;
    }

    public void setCurrentVideoState(VideoState videoState){
        this.currentVideoState = videoState;
        currentVideoState.setVideoContext(this);
    }

    public void play(){
        currentVideoState.play();
    }

    public void pause(){
        currentVideoState.pause();
    }

    public void speed(){
        currentVideoState.speed();
    }

    public void stop(){
        currentVideoState.stop();
    }


}
