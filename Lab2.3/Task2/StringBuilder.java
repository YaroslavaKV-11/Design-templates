public class StringBuilder {
    private String value;

    public StringBuilder() {
        this.value = "";
    }

    public StringBuilder append(String text) {
        value += text;
        return this;
    }

    public StringBuilder insert(int index, String text) {
        if (index < 0 || index > value.length()) {
            System.out.println("Incorrect index: " + index);
            return this;
        }

        String leftPart = value.substring(0, index);
        String rightPart = value.substring(index);

        value = leftPart + text + rightPart;
        return this;
    }

    public MyString build() {
        return new MyString(value);
    }
}