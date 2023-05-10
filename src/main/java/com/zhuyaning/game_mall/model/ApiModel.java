package com.zhuyaning.game_mall.model;

import java.time.LocalDateTime;

/**
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/02/23
 *   Time: 18:05
 */

public class ApiModel<T> {

    private int status;
    private String apiMsg;
    private T data;
    private final LocalDateTime dateTime;

    public ApiModel() {
        this.status = 200;
        this.apiMsg = "[]~(￣▽￣)~*";
        this.dateTime = LocalDateTime.now();
    }

    public ApiModel(T data) {
        this.status = 200;
        this.apiMsg = "[]~(￣▽￣)~*";
        this.data = data;
        this.dateTime = LocalDateTime.now();
    }

    public ApiModel(int status, String apiMsg, T data) {
        this.status = status;
        this.apiMsg = apiMsg;
        this.data = data;
        this.dateTime = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getApiMsg() {
        return apiMsg;
    }

    public void setApiMsg(String apiMsg) {
        this.apiMsg = apiMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "ApiModel{" +
                "status=" + status +
                ", apiMsg='" + apiMsg + '\'' +
                ", data=" + data +
                ", dateTime=" + dateTime +
                '}';
    }
}
