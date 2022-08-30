package com.sbms;

public class TechStack {
	private String stack;
	private String framework;
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	@Override
	public String toString() {
		return "TechStack [stack=" + stack + ", framework=" + framework + "]";
	}
	

}
