package com.wyz.web.biz;

import com.caucho.hessian.server.HessianServlet;
import com.wyz.web.Operator;

/**
 * @author wangyz
 * @since 2012-3-28 下午11:39:30
 * @version 1.0
 */

public class BizOperator extends HessianServlet implements Operator {
	private static final long serialVersionUID = 4539928718395743376L;

	public void process() {

	}

	public Object process(Object obj) {
		return null;
	}

}
