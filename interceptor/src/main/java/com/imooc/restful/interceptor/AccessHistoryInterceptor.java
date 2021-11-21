package com.imooc.restful.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-07 17:30]
 */
public class AccessHistoryInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Logger logger = LoggerFactory.getLogger(AccessHistoryInterceptor.class);
        StringBuilder builder = new StringBuilder();
        builder.append(request.getRemoteAddr());
        builder.append("|");
        builder.append(request.getRequestURL());
        builder.append("|");
        builder.append(request.getHeader("user-agent"));
        logger.info(builder.toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
