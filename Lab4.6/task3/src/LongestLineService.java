public class LongestLineService implements Observer {

    private String longestLine = "";

    public void update(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    public String getLongestLine() {
        return longestLine;
    }
}