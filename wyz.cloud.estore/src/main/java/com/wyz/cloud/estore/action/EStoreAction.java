package com.wyz.cloud.estore.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wyz.cloud.common.FacedeAction;

/**
 * @author wangyz
 * @since 2012-3-28 下午11:17:43
 * @version 1.0
 */
@ParentPackage("template-default")
@ExceptionMappings({ @ExceptionMapping(result = "error", exception = "java.lang.Exception") })
public class EStoreAction extends FacedeAction {
	private static final long serialVersionUID = -3509693766765853957L;
	private final static Logger log = LoggerFactory.getLogger(EStoreAction.class);

	@Action("estore_index")
	public String index() throws Exception {
		log.debug("EStoreAction is invoking...");
		return "";
	}
	
	
}
