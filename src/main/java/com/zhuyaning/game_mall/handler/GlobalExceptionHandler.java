package com.zhuyaning.game_mall.handler;

import com.zhuyaning.game_mall.model.ApiModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.SystemException;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/02/23
 *   Time: 18:04
 */

public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public ApiModel<String> busyExceptionHandler(Exception exception) {

        logger.error(exception.getMessage());

        //判断是否是自定义的业务异常
        if (exception instanceof SystemException) {
            SystemException sysTemException = (SystemException) exception;
            ApiModel<String> apiModel = new ApiModel<>();
            apiModel.setStatus(sysTemException.errorCode);
            apiModel.setApiMsg(sysTemException.getMessage());
            return apiModel;
        } else {
            logger.error(exception.getMessage());
        }
        return new ApiModel<>();
    }
}
