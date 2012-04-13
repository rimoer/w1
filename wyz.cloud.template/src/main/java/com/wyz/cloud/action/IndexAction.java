package com.wyz.cloud.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wyz.cloud.common.FacedeAction;

@ParentPackage("template-default")
public class IndexAction extends FacedeAction {
	private static final long serialVersionUID = -35048722565704733L;
	private final static Logger log = LoggerFactory.getLogger(IndexAction.class);

	public String execute() throws Exception {
		return super.execute();
	}

}
