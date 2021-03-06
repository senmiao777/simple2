package com.auto.config;

import com.auto.Constant;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/5 0005 上午 10:33
 */

@WebFilter(filterName = "EncrypteFilter", urlPatterns = "/*")
@Configuration
public class EncrypteFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("EncrypteFilter init");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("EncrypteFilter doFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Object stockCode = request.getParameter("stockCode");
        Map<String, String[]> params = request.getParameterMap();

        for (Map.Entry<String, String[]> param : params.entrySet()) {
            String key = param.getKey();  // 参数名
            String[] value = param.getValue();  // 参数值
            System.out.println("key=" + key + "value=" + value);

        }

        if (stockCode != null) {
            int i = new Random().nextInt();
            System.out.println("url=" + request.getRequestURL() + "随机数=" + i);
            request.setAttribute(Constant.ATTRIBUTE_KEY.getCode(), i);

        } else {
            System.out.println("stockCode is null");
        }
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("EncrypteFilter destroy");
    }
}
