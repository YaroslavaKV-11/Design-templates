public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        MyString firstString = builder
                .append("Java")
                .append(" Builder")
                .insert(5, "Pattern ")
                .build();

        System.out.println("First string: " + firstString);

        Director director = new Director();

        MyString greeting = director.buildGreeting();
        MyString studentMessage = director.buildStudentMessage();
        MyString libraryWord = director.buildLibraryWord();

        System.out.println("Greeting: " + greeting);
        System.out.println("Student message: " + studentMessage);
        System.out.println("Library word: " + libraryWord);
    }
}