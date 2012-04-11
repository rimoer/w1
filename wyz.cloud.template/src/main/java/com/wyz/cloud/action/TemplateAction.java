package com.wyz.cloud.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wyz.cloud.common.FacedeAction;
import com.wyz.service.template.TemplateService;

/**
 * @author wangyz
 * @since 2012-3-28 下午11:17:43
 * @version 1.0
 */

@ParentPackage("template-default")
public class TemplateAction extends FacedeAction {
	private static final long serialVersionUID = -3509693766765853957L;

	private final static Logger log = LoggerFactory.getLogger(TemplateAction.class);

	@Autowired
	TemplateService templateService = null;

}
