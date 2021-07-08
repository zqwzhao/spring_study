package com.zqwzhao.reflect;

import com.zqwzhao.utils.MySQLDBUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * 要查询N张表的数据，但是不想写N个方法,写一个方法完成所有表的查询操作
 * @Auther: zhaoqw
 * @Date: 2021/5/28 - 05 - 28 - 17:05
 * @Description: com.zqwzhao.reflect
 * @version: 1.0
 *
 */
public class BaseDaoImpl {
    /**
     * 统一的查询表的方法
     * @param sql 不同的sql语句
     * @param params sql语句的参数
     * @param clazz sql语句查询返回的对象
     * @return
     */
    public List getRows(String sql, Object[] params, Class clazz) {
        List list = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;

        //建立连接

        try {
            conn = MySQLDBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            //给sql语句填充参数
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1,params[i]);
                }
            }

            //开始执行查询操作，resultSet中有返回的结果，需要将放回的结果放置到不同的对象中去
            res = pstmt.executeQuery();

            //获取结果集中的元数据对象
            ResultSetMetaData metaData = res.getMetaData();
            //判断查询到的每一条记录中包含多少个列
            int columnCount = metaData.getColumnCount();
            //循环遍历resultSet
            while(res.next()) {
                //创建放置具体结果属性的对象
                Object obj = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //从结果集中获取单一列的值
                    Object objValue = res.getObject(i + 1);
                    //获取列名称
                    String columnName = metaData.getColumnName(i + 1).toLowerCase();

                    //获取类中属性
                    Field declaredField = clazz.getDeclaredField(columnName);
                    //获取类中属性对应的set方法
                    Method method = clazz.getMethod(getSetName(columnName),declaredField.getType());
                    if (objValue instanceof Number) {
                        Number number = (Number) objValue;
                        String fname = declaredField.getType().getName();
                        if ("int".equals(fname) || "java.lang.Integer".equals(fname)) {
                            method.invoke(obj,number.intValue());
                        }else if ("byte".equals(fname) || "java.lang.Byte".equals(fname)) {
                            method.invoke(obj,number.byteValue());
                        }else if ("short".equals(fname) || "java.lang.Short".equals(fname)) {
                            method.invoke(obj,number.shortValue());
                        }else if ("long".equals(fname) || "java.lang.Long".equals(fname)) {
                            method.invoke(obj,number.longValue());
                        }else if ("float".equals(fname) || "java.lang.Float".equals(fname)) {
                            method.invoke(obj,number.floatValue());
                        }else if ("double".equals(fname) || "java.lang.Double".equals(fname)) {
                            method.invoke(obj,number.doubleValue());
                        }else {
                            method.invoke(obj,objValue);
                        }
                    }


                }
                list.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }finally {
            MySQLDBUtil.closeConnection(conn,pstmt,res);
        }

        return list;
    }

    public String getSetName(String name) {
        return "set" + name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public static void main(String[] args) {
        BaseDaoImpl baseDao = new BaseDaoImpl();
        List rows = baseDao.getRows("select empno,ename,sal,deptno from t_emp where deptno = ?", new Object[]{10}, Emp.class);
        Iterator iterator = rows.iterator();
        while (iterator.hasNext()) {
            Emp emp =(Emp) iterator.next();
            System.out.println(emp);
        }

    }


    public void updateRows() {};
    public void deleteRows(){};

    public void insertRows() {};
}
