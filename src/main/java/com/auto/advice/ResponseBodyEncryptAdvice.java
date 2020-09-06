package com.auto.advice;

import com.auto.Constant;
import com.auto.Result;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/6 0006 下午 2:00
 */
@Configuration
@ControllerAdvice
public class ResponseBodyEncryptAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        System.out.println("-----simple2------ResponseBodyEncryptAdvice beforeBodyWrite");
        ServletServerHttpRequest serverHttpRequest1 = (ServletServerHttpRequest) serverHttpRequest;
        HttpServletRequest servletRequest = serverHttpRequest1.getServletRequest();
        Object userId = servletRequest.getAttribute(Constant.ATTRIBUTE_KEY.getCode());
        System.out.println("Object={}" + o.toString());
        System.out.println("userId=" + userId);
        return new Result(o, "justtestsign");
    }
}
