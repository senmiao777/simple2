package com.auto;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/6 0006 下午 2:35
 */
public enum Constant {

    ATTRIBUTE_KEY("ATTRIBUTE_KEY");
    private String code;

    public String getCode() {
        return code;
    }

    Constant(String code) {
        this.code = code;
    }
}
