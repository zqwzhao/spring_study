package com.zqwzhao.lambda;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/27 - 05 - 27 - 19:45
 * @Description: com.zqwzhao.lambda
 * @version: 1.0
 */
@FunctionalInterface
public interface StudentDao {
    void insert(Student student);
}
