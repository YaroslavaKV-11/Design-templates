public class PausedState implements State {

    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("pause button");

        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }

    public void pause(MediaPlayer mediaPlayer) {
    }
}