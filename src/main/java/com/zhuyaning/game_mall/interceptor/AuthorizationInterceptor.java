package com.zhuyaning.game_mall.interceptor;

import com.zhuyaning.game_mall.annotation.IgnoreAuth;
import com.zhuyaning.game_mall.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ZhuYaning
 * Date: 2022/04/18
 * Time: 23:24
 */
@Configuration
public class AuthorizationInterceptor implements HandlerInterceptor {

    private RedisService redisService;

    @Autowired
    public void setRedisService(RedisService redisService) {
        this.redisService = redisService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return true;     //不拦截直接放行。
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if (method.getAnnotation(IgnoreAuth.class) != null) {
            return true; //存在注解不验证直接放行。
        } else {        //不存在注解需要判断是否登录
            String token = request.getHeader("token");
            if (!StringUtils.isEmpty(token)) {
                String userID = redisService.get(token);
                return !StringUtils.isEmpty(userID); //登陆了为True，没登陆为false。
            }
        }
        //放行。
        return true;
    }
}