package com.zhuyaning.game_mall.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/02/23
 *   Time: 18:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiModel<T> {
    private int status;
    private String apiMsg;
    private T date;
}
