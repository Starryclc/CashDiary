package service;

import DAO.RecordDAO;
import entity.Category;
import entity.Record;

import java.util.Date;

public class RecordService {
    private RecordDAO dao = new RecordDAO();



    public void add(int spend, Category c, Date date, String comment) {
        Record r = new Record(-1, c.getId(), spend, date, comment);
    }

}


