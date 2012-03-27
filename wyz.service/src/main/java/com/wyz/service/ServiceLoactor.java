package com.wyz.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author wangyz
 * @created 2012-3-12 下午11:34:40
 * @version 1.0
 */

public class ServiceLoactor implements BeanFactoryAware {
	private static BeanFactory beanFactory = null;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		ServiceLoactor.beanFactory = beanFactory;
	}

	public static BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public static Object getService(String name) {
		return beanFactory.getBean(name);
	}

	public static Object getService(String name, Class<?> clazz) {
		return beanFactory.getBean(name, clazz);
	}
}
