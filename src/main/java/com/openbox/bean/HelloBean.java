package com.openbox.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 描述: bean 的生命周期
 *
 * @author: luming.shi   Created on 18/3/2.
 */
public class HelloBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanPostProcessor{


    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
