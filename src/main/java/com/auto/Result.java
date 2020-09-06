package com.auto;

import java.io.Serializable;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/6 0006 下午 2:43
 * 给前端返回的加密后数据格式
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 4158266974196586397L;
    private Long timeStamp;
    private Object data;
    private String sign;

    public Result(Object data, String sign) {
        this.timeStamp = System.currentTimeMillis();
        this.data = data;
        this.sign = sign;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
