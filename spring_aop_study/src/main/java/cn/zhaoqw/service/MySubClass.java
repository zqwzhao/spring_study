package cn.zhaoqw.service;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/22 - 07 - 22 - 14:31
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
public class MySubClass implements MyInterface{
    @Override
    public void show() {
        System.out.println("my subclass...");
    }
}
