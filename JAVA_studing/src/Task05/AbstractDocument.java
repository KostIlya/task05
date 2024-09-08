package Task05;

import java.time.LocalDate;

public abstract class AbstractDocument implements Document {
    private int id;
    private String name;
    private LocalDate date;
    private Status status;
    public AbstractDocument(int id, String name) {
        this.id = id;
        this.name = name;
        this.date = LocalDate.now();
        this.status = Status.CREATED;
    }
    public abstract boolean isValidationDocument();
    public abstract void printDocument();

    enum Status {
        CREATED,
        APPROVED
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
