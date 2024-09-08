package Task05;

public class DocumentsProcessor {
    Document[] documents;

    public DocumentsProcessor(Document[] documents) {
        this.documents = documents;
    }
    public void process(DocumentsProcessStrategy documentsProcessStrategy) {
        documentsProcessStrategy.process(documents);
    }
}
