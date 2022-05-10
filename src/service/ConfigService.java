package service;

import DAO.ConfigDAO;
import entity.Config;

public class ConfigService {
    private static ConfigDAO dao = new ConfigDAO();

    static {
        init("budget","3000"); //default_budget = 3000
        init("dbpath","");
        System.out.println("数据库初始化成功");
    }

    //初始化
    public static void init(String key, String value) {
        Config config = dao.getByKey(key);
        if (config.getKey() == null) {
            config.setKey(key);
            config.setValue(value);
            dao.add(config);
        }
    }

    //通过key找value
    public String get(String key) {
        Config config = dao.getByKey(key);
        return config.getValue();
    }

    //改
    public void update(String key, String value) {
        Config config = dao.getByKey(key);
        config.setValue(value);
        dao.update(config);
    }

    public int getIntBudget() {
        return Integer.parseInt(get("budget"));
    }
}
