package com.zhaoqw.springmvc.converter;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/19 - 08 - 19 - 9:45
 * @Description: com.zhaoqw.springmvc.converter
 * @version: 1.0
 */
public class MyDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return parse;
    }


}
