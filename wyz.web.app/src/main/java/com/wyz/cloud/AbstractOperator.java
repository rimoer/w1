package com.wyz.cloud;

public class AbstractOperator implements Operator {

	public void process() {

	}

	public Object process(Object obj) {
		return null;
	}

	public Object processInvoke(Object obj) {
		return process(obj);
	}
}
