package com.zqwzhao.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/30 - 05 - 30 - 10:31
 * @Description: com.zqwzhao.bean
 * @version: 1.0
 */
public class PersonTwo {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Address address;
    private String[] hobbies;
    private List<Address> books;
    private Set<String> sets;
    private Map<String, Object> maps;
    private Properties properties;

    public PersonTwo() {
    }

    public PersonTwo(int id, String name, int age, String gender,
                     Address address, String[] hobbies, List<Address> books,
                     Set<String> sets, Map<String, Object> maps, Properties properties) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.hobbies = hobbies;
        this.books = books;
        this.sets = sets;
        this.maps = maps;
        this.properties = properties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public List<Address> getBooks() {
        return books;
    }

    public void setBooks(List<Address> books) {
        this.books = books;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "PersonTwo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", books=" + books +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
