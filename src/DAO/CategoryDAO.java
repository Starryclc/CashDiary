package DAO;

import entity.Category;
import entity.Config;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    //增
    public void add(Category category){
        String sql = String.format("insert into category values (null, '%s')",category.getName());
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            category.setId(id);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //删
    public void delete(int id) {
        String sql = String.format("delete from category where id = %d", id);
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
    public void update(Category category) {
        String sql = String.format("update category set name = '%s' where id = %d", category.getName(), category.getId());
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
    public Category get(int id) {
        String sql = String.format("select * from category where id = %d", id);
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            Category category = new Category(id, rs.getString("name"));
            return category;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    //查询全部
    public List<Category> list(){
        List<Category> categorys = list(0,Short.MAX_VALUE);
        return categorys;
    }

    public List<Category> list(int start, int cnt){
        String sql = String.format("select * from category limit %d,%d", start, cnt);
        List<Category> categorys = new ArrayList<>();
        try{
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Category category = new Category(rs.getInt(1), rs.getString("name"));
                categorys.add(category);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return categorys;
    }


}
