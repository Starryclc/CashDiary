package entity;

public class Config {
    private int id;
    private String key;
    private String value;

    public Config(){
        this.id = 0;
        this.key = "";
        this.value = "";
    }
    public Config(int id, String key,String value){
        this.id = id;
        this.key = key;
        this.value = value;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
