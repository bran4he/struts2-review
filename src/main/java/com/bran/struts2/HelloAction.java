package com.bran.struts2;

public class HelloAction {

	private String name;

	public String execute() throws Exception {
		System.out.println("action receive name is:" + this.name);
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
