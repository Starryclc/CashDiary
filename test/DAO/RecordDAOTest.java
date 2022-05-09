package DAO;

import entity.Record;
import org.junit.Test;
import util.DateUtil;

import java.util.List;

public class RecordDAOTest {
    @Test
    public void testAdd(){
        Record record = new Record(-1,2,50, DateUtil.today(),"滴滴");
        RecordDAO dao = new RecordDAO();
        dao.add(record);
        System.out.println(record.getId());
    }
    @Test
    public void deleteTest() {
        RecordDAO dao = new RecordDAO();
        dao.delete(3);
    }
    @Test
    public void updateTest(){
        Record record = new Record(1,3,60, DateUtil.today(),"活着");
        RecordDAO dao = new RecordDAO();
        dao.update(record);
    }

    @Test
    public void listTest(){
        RecordDAO dao = new RecordDAO();
        List<Record> r = dao.list();
        for(Record e: r){
            System.out.println(e.toString());
        }
    }
}
