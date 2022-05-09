package DAO;

import entity.Category;
import entity.Config;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CategoryDAOTest {
    @Test
    public void testAdd(){
        Category category = new Category(-1,"book");
        CategoryDAO dao = new CategoryDAO();
        dao.add(category);
        System.out.println(category.getId());
    }

    @Test
    public void testDelete(){
        CategoryDAO dao = new CategoryDAO();
        dao.delete(1);
    }

    @Test
    public void updateTest(){
        Category category = new Category(2,"transport");
        CategoryDAO dao = new CategoryDAO();
        dao.update(category);
    }

    @Test
    public void testList() {
        CategoryDAO dao = new CategoryDAO();
        List<Category> list = dao.list();
        for(Category c: list){
            System.out.println(c);
        }
    }
}
