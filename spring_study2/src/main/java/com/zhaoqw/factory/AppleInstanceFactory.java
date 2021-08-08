package com.zhaoqw.factory;

import com.zhaoqw.bean.Apple;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/24 - 07 - 24 - 16:40
 * @Description: com.zhaoqw.factory
 * @version: 1.0
 */
public class AppleInstanceFactory {
    public Apple getInstance() {
        Apple apple = new Apple();
        apple.setColor("绿色");
        apple.setTitle("xx");
        apple.setOrigin("欧洲");
        return apple;
    }
}
