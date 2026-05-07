public class PlayingState implements State {

    public void play(MediaPlayer mediaPlayer) {
    }

    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());

        System.out.println("Paused " + mediaPlayer.getCurrentTrack());
    }

    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);

        System.out.println("Playing " + mediaPlayer.getCurrentTrack());
    }

    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);

        System.out.println("Playing " + mediaPlayer.getCurrentTrack());
    }

    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StoppedState());

        System.out.println("Stopped " + mediaPlayer.getCurrentTrack());
    }
}