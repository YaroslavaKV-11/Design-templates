public class WordCounterService implements Observer {

    private int count = 0;

    public void update(String line) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }
}