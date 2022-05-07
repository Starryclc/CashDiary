package entity;

public class Category {
    private int id;
    private String name;
    private int recordNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public int getId() {
        return id;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public String getName() {
        return name;
    }

}
