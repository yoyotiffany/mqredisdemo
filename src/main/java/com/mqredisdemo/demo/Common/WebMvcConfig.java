package com.mqredisdemo.demo.Common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * author：yq
 * date: 2019/6/19
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//        if(!registry.hasMappingForPattern("/static/**")){
//            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        }
        super.addResourceHandlers(registry);
    }
}
