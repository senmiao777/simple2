package com.auto.config;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/5 0005 下午 8:14
 */
public class GetHashCodeClass {
    private String targe;
    public GetHashCodeClass(String target){
        this.targe = target;
    }

    public String getHashCode(){
        return String.valueOf(this.targe.hashCode());
    }

    public String getName(){
        return "sdfsdf12345";

    }
}
