package behavior.state;

public abstract class VideoState {



        protected VideoContext videoContext;

        public void setVideoContext(VideoContext videoContext) {
            this.videoContext = videoContext;
        }

        /**
         * 播放
         *      对应播放状态
         */
        public abstract void play();

        /**
         * 停止
         *      对应停止状态
         */
        public abstract void pause();

        /**
         * 快进
         *      对应快进状态
         */
        public abstract void speed();

        /**
         * 停止
         *      对应停止状态
         */
        public abstract void stop();



}
