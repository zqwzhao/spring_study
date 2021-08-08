package com.zhaoqw.factory;

import com.zhaoqw.bean.Apple;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/24 - 07 - 24 - 16:40
 * @Description: com.zhaoqw.factory
 * @version: 1.0
 */
public class AppleStaticFactory {
    public static Apple createSweetApple() {
        Apple apple = new Apple();
        apple.setColor("红色");
        apple.setTitle("红富士");
        apple.setOrigin("日本");
        return apple;
    }
}
