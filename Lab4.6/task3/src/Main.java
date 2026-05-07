public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("resources/input01.txt");

        LongestLineService longestLineService = new LongestLineService();
        LongestWordService longestWordService = new LongestWordService();
        WordCounterService wordCounterService = new WordCounterService();
        LongestWordLineService longestWordLineService = new LongestWordLineService();

        fileReader.attach(longestLineService);
        fileReader.attach(longestWordService);
        fileReader.attach(wordCounterService);
        fileReader.attach(longestWordLineService);

        fileReader.read();

        System.out.println("Longest line: " + longestLineService.getLongestLine());
        System.out.println("Longest word: " + longestWordService.getLongestWord());
        System.out.println("Words count: " + wordCounterService.getCount());
        System.out.println("Line with longest word: " + longestWordLineService.getLineWithLongestWord());
    }
}