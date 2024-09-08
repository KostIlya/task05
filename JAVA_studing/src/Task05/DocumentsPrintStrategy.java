package Task05;


import javax.print.Doc;
import java.sql.SQLOutput;

public class DocumentsPrintStrategy implements DocumentsProcessStrategy {
    Document[] documents;
    @Override
    public void process(Document[] documents) {
        for (Document document : documents) {
            document.printDocument();
        }
    }
}
