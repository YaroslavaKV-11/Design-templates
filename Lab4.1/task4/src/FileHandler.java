public abstract class FileHandler {
    protected FileHandler next;

    public FileHandler setNext(FileHandler next) {
        this.next = next;
        return next;
    }

    public void open(String fileName) {
        if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("No program found for file: " + fileName);
        }
    }

    protected String getExtension(String fileName) {
        int index = fileName.lastIndexOf(".");
        if (index == -1) {
            return "";
        }
        return fileName.substring(index + 1).toLowerCase();
    }
}