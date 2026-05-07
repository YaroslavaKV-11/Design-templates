public class PlayingState implements State {

    public void play(MediaPlayer mediaPlayer) {
    }

    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        mediaPlayer.setIcon("play button");

        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }
}