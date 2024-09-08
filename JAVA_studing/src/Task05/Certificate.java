package Task05;

import java.time.LocalDate;

public class Certificate extends AbstractDocument {
    private String organizationSentCertificate; // Организация, куда направлена справка. Название организации с Прописной буквы и больше 3 символов
    private LocalDate dateCertificateExpiration; // Дата окончания действия справки
    private String nameSigner; // имя подписавшего справку в формате "Фамилия.И.О."
    public Certificate(int id, String name, String organizationSentCertificate, LocalDate dateCertificateExpiration, String nameSigner) {
        super(id, name);
        this.organizationSentCertificate = organizationSentCertificate;
        this.dateCertificateExpiration = dateCertificateExpiration;
        this.nameSigner = nameSigner;
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
        if ((organizationSentCertificate.substring(0,1).equals(organizationSentCertificate.substring(0,1).toUpperCase()) &&
                (organizationSentCertificate.length() > 3)) && (this.dateCertificateExpiration.isAfter(this.getDateIssue())) &&
                (this.nameSigner.matches("[А-Я][а-я]+\\.[А-Я]\\.[А-Я]\\."))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printDocument() {
        System.out.printf("Название документа: %s, дата создания документа: %s, организация куда направлена справка: %s, " +
                        "дата окончания действия справки: %s, имя подписавшего справку: %s" +
                        "валидность документа: %s. \n", this.getNameDocument(), this.getDateIssue(),
                        this.organizationSentCertificate, this.dateCertificateExpiration, this.nameSigner,
                        this.isValidationDocument()?"подтверждена":"отклонена");
    }

    public String getOrganizationSentCertificate() {
        return organizationSentCertificate;
    }

    public LocalDate getDateCertificateExpiration() {
        return dateCertificateExpiration;
    }

    public String getNameSigner() {
        return nameSigner;
    }
}
