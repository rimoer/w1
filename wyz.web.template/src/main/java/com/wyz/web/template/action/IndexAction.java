package com.wyz.web.template.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

/**
 * @author WANGYZ
 * @since 2011-12-1
 * @version 1.0
 */
public class IndexAction implements Preparable {
	private final Logger logger = LoggerFactory.getLogger(IndexAction.class);

	public String execute() {
		return Action.SUCCESS;
	}

	public void prepare() throws Exception {

	}

}
