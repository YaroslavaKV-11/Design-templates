public class ExcelFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        String extension = getExtension(fileName);
        if (extension.equals("xls") || extension.equals("xlsx")) {
            System.out.println("Open table file " + fileName + " with spreadsheet program.");
        } else {
            super.open(fileName);
        }
    }
}