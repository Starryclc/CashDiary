package entity;

import java.util.Date;

public class Record {
    private int id;
    private int cid;
    private int spend;
    private Date date;
    private String comment;

    public Record(int id, int cid, int spend, Date date, String comment) {
        this.id = id;
        this.cid = cid;
        this.spend = spend;
        this.date = date;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", cid=" + cid +
                ", spend=" + spend +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                '}';
    }
}
