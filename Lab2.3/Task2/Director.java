public class Director {

    public MyString buildGreeting() {
        return new StringBuilder()
                .append("Hello")
                .append(", ")
                .append("world")
                .append("!")
                .build();
    }

    public MyString buildStudentMessage() {
        return new StringBuilder()
                .append("I study Java")
                .insert(8, "really ")
                .build();
    }

    public MyString buildLibraryWord() {
        return new StringBuilder()
                .append("Liby")
                .insert(3, "rar")
                .build();
    }
}