package com.zqwzhao.bean;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/30 - 05 - 30 - 10:33
 * @Description: com.zqwzhao.bean
 * @version: 1.0
 */
public class Address {
    private String province;
    private String city;
    private String town;


    public Address() {
    }

    public Address(String province, String city, String town) {
        this.province = province;
        this.city = city;
        this.town = town;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void init() {
        //N行逻辑代码实现初始化功能更
        System.out.println("Address 对象初始化完成");
    }

    public void destory() {
        System.out.println("Address 对象销毁");
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
