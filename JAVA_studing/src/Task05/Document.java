package Task05;

import java.time.LocalDate;

public interface Document {
    public String getNameDocument(); // получить название документа
    public LocalDate getDateIssue(); // дата выдачи документа
    public boolean isValidationDocument(); // валидация документа
    public void printDocument(); // печать информации о документе
}
