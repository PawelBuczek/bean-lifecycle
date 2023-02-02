package com.kodilla.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class BeanLogger implements BeanPostProcessor {

    Logger logger = Logger.getLogger("my-logger");

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.log(new LogRecord(Level.INFO, "New bean was created: " + bean.toString()));
        return bean;
    }

}
