package service;

import DAO.CategoryDAO;
import entity.Category;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {

    private static CategoryDAO categoryDAO = new CategoryDAO();

    public void add(String name){
        Category c = new Category(0,name);
        categoryDAO.add(c);
    }

    public void delete(int id) {
        categoryDAO.delete(id);
    }

    public void update(int id , String name) {
        Category c = new Category(id, name);
        categoryDAO.update(c);
    }

    public List<Category> list() {
        List<Category> res = categoryDAO.list();
        return res.stream().sorted(Comparator.comparing(Category::getRecordNumber))
                .collect(Collectors.toList());
    }


}
