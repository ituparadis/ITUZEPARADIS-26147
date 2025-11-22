package _27089.Q3;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity() {}

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new EmployeeDataException("ID must be > 0");
        this.id = id;
    }


    public LocalDate getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDate createdDate) {
        if (createdDate == null) throw new EmployeeDataException("Date cannot be null");
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}