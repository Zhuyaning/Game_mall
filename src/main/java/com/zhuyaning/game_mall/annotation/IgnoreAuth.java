package com.zhuyaning.game_mall.annotation;

/**
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/04/18
 *   Time: 23:44
 */


import java.lang.annotation.*;

/**
 * 忽略Token验证,在不需要登录的Controller中的方法上加，表示此请求不需要登录就可以使用。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {
}
