package com.collectiondemo.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/26 - 07 - 26 - 9:18
 * @Description: com.collectiondemo.entity
 * @version: 1.0
 */
public class Company {
    private List<String> rooms;
    private Map<String,Computer> computers;
    private Properties info;

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public Map<String, Computer> getComputers() {
        return computers;
    }

    public void setComputers(Map<String, Computer> computers) {
        this.computers = computers;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Company{" +
                "rooms=" + rooms +
                ", computers=" + computers +
                ", info=" + info +
                '}';
    }
}
