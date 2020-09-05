package com.auto.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author frank
 * @version 1.0
 * @date 2020/9/5 0005 下午 8:13
 */
@Configuration
@ConditionalOnClass(JustTest.class)
public class MyAutoConfig2 {

    @ConditionalOnMissingBean
    @Bean
    public JustTest getjustTest() {
        return new JustTest();
    }
}
