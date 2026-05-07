public class LongestWordLineService implements Observer {

    private String longestWord = "";

    private String lineWithLongestWord = "";

    public void update(String line) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }
}