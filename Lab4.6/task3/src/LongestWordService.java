public class LongestWordService implements Observer {

    private String longestWord = "";

    public void update(String line) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}