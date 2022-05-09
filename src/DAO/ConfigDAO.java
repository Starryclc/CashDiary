package DAO;

import entity.Config;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConfigDAO {
    //增
    public void add(Config config){
        String sql = String.format("insert into config values (null, '%s', '%s')",config.getKey(), config.getValue());
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            config.setId(id);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //删
    public void delete(int id) {
        String sql = String.format("delete from config where id = %d", id);
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
    public void update(Config config) {
        String sql = String.format("update config set key_ = '%s', value = '%s' where id = %d", config.getKey(), config.getValue(), config.getId());
        System.out.println(sql);
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
    public List<Config> list(){
        List<Config> configs = list(0,Short.MAX_VALUE);
        return configs;
    }

    public List<Config> list(int start, int cnt){
        String sql = String.format("select * from config limit %d,%d", start, cnt);
        List<Config> configs = new ArrayList<>();
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Config config = new Config(rs.getInt(1), rs.getString("key_"),rs.getString("value"));
                configs.add(config);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return configs;
    }
}
