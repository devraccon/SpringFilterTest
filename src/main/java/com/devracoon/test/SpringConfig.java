package com.devracoon.test;

import com.devracoon.test.filter.OneFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SpringConfig {

    @Bean
    public FilterRegistrationBean<OneFilter> getOneFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new OneFilter());
        registrationBean.setOrder(0);
        return registrationBean;

    }
}
