package DAO;

import entity.Config;
import org.junit.Test;

import java.util.List;

public class ConfigDAOTest {
    @Test
    public void testAdd(){
        Config config = new Config(-1,"key1","value1");
        ConfigDAO configDAO = new ConfigDAO();
        configDAO.add(config);
        System.out.println(config.getId());
    }

    @Test
    public void testDelete(){
        ConfigDAO configDAO = new ConfigDAO();
        configDAO.delete(2);
    }

    @Test
    public void testUpdate(){
        ConfigDAO configDAO = new ConfigDAO();
        Config config = new Config(4,"key4","value4");
        configDAO.update(config);
    }

    @Test
    public void testList(){
        ConfigDAO configDAO = new ConfigDAO();
        List<Config> configs = configDAO.list(0,2);
        for(Config e :configs){
            System.out.println(e.toString());
        }
    }

}
