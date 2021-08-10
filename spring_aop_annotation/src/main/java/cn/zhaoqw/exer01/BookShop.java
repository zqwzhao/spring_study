package cn.zhaoqw.exer01;

import org.springframework.stereotype.Component;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/8 - 08 - 08 - 16:44
 * @Description: cn.zhaoqw.exer01
 * @version: 1.0
 */
@Component
public class BookShop {
    public void sellingBooks(String name) {
        System.out.println("卖出了一本《" + name + "》");
    }
}
