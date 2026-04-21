public class Client {
    public static void main(String[] args) {
        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        // Create Chain of responsibility to open file by correct program according to the extension.
        FileHandler imageHandler = new ImageFileHandler();
        FileHandler wordHandler = new WordFileHandler();
        FileHandler excelHandler = new ExcelFileHandler();
        FileHandler powerPointHandler = new PowerPointFileHandler();
        FileHandler pdfHandler = new PdfFileHandler();

        imageHandler
                .setNext(wordHandler)
                .setNext(excelHandler)
                .setNext(powerPointHandler)
                .setNext(pdfHandler);

        for (String file : files) {
            // open file
            imageHandler.open(file);
        }
    }
}