package entity;

public class Category {
    private int id;
    private String name;
    private int recordNumber;

    public Category(){
        this.id = 0;
        this.name = "";
    }
    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
