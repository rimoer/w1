package com.wyz.cloud.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.wyz.service.template.TemplateService;

/**
 * @author wangyz
 * @since 2012-3-28 下午11:17:43
 * @version 1.0
 */

public class TemplateServlet extends ActionSupport {
	private static final long serialVersionUID = -3509693766765853957L;
	private final static Logger log = LoggerFactory.getLogger(TemplateServlet.class);

	@Autowired
	TemplateService templateService = null;

}
