package Task05;

public class DocumentsValidationStrategy implements DocumentsProcessStrategy {
    Document[] documents;
    @Override
    public void process(Document[] documents) {
        for (Document document : documents) {
            document.isValidationDocument();
        }
    }
}
