package com.bran.struts2;

import org.apache.log4j.Logger;

public class HelloAction {

	private static final Logger logger = Logger.getLogger(HelloAction.class);
	private String name;

	public String execute() throws Exception {
		logger.info("action receive name is:" + this.name);
		if("redirect".equals(this.name)){
			return "redirect";
		}else if("fm".equals(this.name)){
			return "fm";
		}else{
			return "success";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
