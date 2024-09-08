package Task05;

import java.time.LocalDate;

public class Statement extends AbstractDocument {
    private String issuingOrganization; // организация выдавшая выписку
    public Statement(int id, String nameDocument, String issuingOrganization){
        super(id, nameDocument);
        this.issuingOrganization = issuingOrganization;
    }
    @Override
    public String getNameDocument() {
        return this.getName();
    }

    @Override
    public LocalDate getDateIssue() {
        return this.getDate();
    }

    @Override
    public boolean isValidationDocument() {
        if (issuingOrganization.substring(0,1).equals(issuingOrganization.substring(0,1).toUpperCase()) && (issuingOrganization.length() > 3))
            return true;
        else {
            return false;
        }
    }

    @Override
    public void printDocument() {
        System.out.printf("Название документа: %s, дата создания документа: %s, организация выдавшая справку: %s, " +
                "валидность документа: %s. \n", this.getNameDocument(), this.getDateIssue(),
                this.issuingOrganization, this.isValidationDocument()?"подтверждена":"отклонена");
    }
}
