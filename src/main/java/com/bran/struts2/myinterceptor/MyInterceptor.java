package com.bran.struts2.myinterceptor;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	private static final Logger logger = Logger.getLogger(MyInterceptor.class);
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		logger.debug("my interceptor destroy...");
		super.destroy();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		logger.debug("my interceptor init---");
		super.init();
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("pre-process...");
		String result = invocation.invoke();
		logger.info("interceptor process and get result:" + result);
		logger.debug("post-process...");
		return result;
	}

}
