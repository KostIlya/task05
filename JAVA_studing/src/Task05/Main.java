package Task05;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Statement statement1 = new Statement(1, "СправкаНамбер1", "Министерство внутренних дел");
        Statement statement2 = new Statement(2, "СправкаНамбер2", "МВД");

        Certificate certificate1 = new Certificate(3, "СправкаНомер33", "Министерство внутренних дел",
                LocalDate.of(2023, 8, 20), "Картапалов.В.С.");
        Certificate certificate2 = new Certificate(4, "СправкаНомер44", "Министерство внутренних дел",
                LocalDate.of(2023, 8, 20), "Картапалов.В.2.");
        Certificate certificate3 = new Certificate(5, "СправкаНомер55", "Министерство внутренних дел",
                LocalDate.of(2023, 2, 20), "Картапалов.В.С.");

        Document[] documents = {statement1, statement2, certificate1, certificate2, certificate3};

        DocumentsProcessor documentsProcessor = new DocumentsProcessor(documents);
        DocumentsValidationStrategy documentsValidationStrategy = new DocumentsValidationStrategy();
        DocumentsPrintStrategy documentsPrintStrategy = new DocumentsPrintStrategy();


        documentsProcessor.process(documentsValidationStrategy);
        documentsProcessor.process(documentsPrintStrategy);
    }
}
