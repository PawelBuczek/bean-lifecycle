package com.kodilla.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class BeanMonitor implements BeanPostProcessor {

    Logger logger = Logger.getLogger("my-logger");

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {

        System.out.println("Before initialization of bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialization of bean: " + beanName);
        logger.log(new LogRecord(Level.INFO, "New bean was created: " + bean.toString()));
        return bean;
    }

}
