package DAO;

import entity.Config;
import entity.Record;
import util.DBUtil;
import util.DateUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecordDAO {
    //增
    public void add(Record record){
        String sql = String.format("insert into record values (null, %d, %d, '%s', '%tF')",record.getSpend(), record.getCid(), record.getComment(), DateUtil.util2sql(record.getDate()));
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            record.setId(id);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //删
    public void delete(int id) {
        String sql = String.format("delete from record where id = %d", id);
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    //改
    public void update(Record record) {
        String sql = String.format("update record set cid = %d, spend = %d, comment = '%s', date = '%tF' where id = %d", record.getCid(),record.getSpend(),record.getComment(),record.getDate(),record.getId());
        //System.out.println(sql);
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    //查
    public Config get(int id) {
        String sql = String.format("select * from config where id = %d", id);
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            Config config = new Config(id, rs.getString("key_"), rs.getString("value"));
            return config;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    //查询全部
    public List<Record> list(){
        List<Record> records = list(0,Short.MAX_VALUE);
        return records;
    }

    public List<Record> list(int start, int cnt){
        String sql = String.format("select * from record limit %d,%d", start, cnt);
        List<Record> records = new ArrayList<>();
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Record record = new Record(rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getDate("date"),rs.getString("comment"));
                records.add(record);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return records;
    }


}
