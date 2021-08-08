package cn.zhaoqw.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/22 - 07 - 22 - 14:30
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Service
public class SecondCalculator implements Calculator{
    @Override
    public Integer add(Integer a, Integer b) throws NoSuchMethodException {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Integer mul(Integer a, Integer b) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Integer div(Integer a, Integer b) throws NoSuchMethodException {
        return null;
    }
}
