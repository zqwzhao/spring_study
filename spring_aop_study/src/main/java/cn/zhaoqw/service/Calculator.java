package cn.zhaoqw.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/16 - 07 - 16 - 20:38
 * @Description: cn.zhaoqw.service
 * @version: 1.0
 */
@Service
public interface Calculator {

    public abstract Integer add(Integer a,Integer b) throws NoSuchMethodException;
    public abstract Integer sub(Integer a, Integer b) throws NoSuchMethodException;
    public abstract Integer mul(Integer a, Integer b) throws NoSuchMethodException;
    public abstract Integer div(Integer a, Integer b) throws NoSuchMethodException;
}
