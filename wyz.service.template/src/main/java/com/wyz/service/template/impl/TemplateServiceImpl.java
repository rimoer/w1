package com.wyz.service.template.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyz.dao.template.TemplateDao;
import com.wyz.service.template.TemplateService;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	TemplateDao templateDao = null;
}
