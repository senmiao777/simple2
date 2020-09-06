package com.auto;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/6 0006 下午 2:43
 * 给前端返回的加密后数据格式
 */
public class Result {
    private Long timeStamp;
    private Object data;
    private String sign;

    public Result(Object data, String sign) {
        this.timeStamp = System.currentTimeMillis();
        this.data = data;
        this.sign = sign;
    }
}
