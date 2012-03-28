package com.wyz.service.template.impl;

import org.springframework.stereotype.Service;

import com.wyz.dao.template.TemplateDao;
import com.wyz.service.template.TemplateService;

/**
 * @author wangyz
 * @since 2012-3-25 下午11:21:26
 * @version 1.0
 */

@Service
public class TemplateServiceImpl implements TemplateService {
	TemplateDao templateDao = null;

	public TemplateDao getTemplateDao() {
		return templateDao;
	}

	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}

}
