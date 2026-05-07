public class StoppedState implements State {

    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());

        System.out.println("Playing " + mediaPlayer.getCurrentTrack());
    }

    public void pause(MediaPlayer mediaPlayer) {
    }

    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);

        System.out.println("Current track is " + mediaPlayer.getCurrentTrack());
    }

    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);

        System.out.println("Current track is " + mediaPlayer.getCurrentTrack());
    }

    public void stop(MediaPlayer mediaPlayer) {
    }
}