package com.zhuyaning.game_mall.annotation;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/04/18
 *   Time: 23:44
 */


import java.lang.annotation.*;

/**
 * 忽略Token验证
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {
}
