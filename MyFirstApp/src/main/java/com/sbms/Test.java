package com.sbms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		TechStack tech = (TechStack)ac.getBean("techstk");
		System.out.println(tech);
	}
}
