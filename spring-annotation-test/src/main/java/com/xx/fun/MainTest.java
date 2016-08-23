package com.xx.fun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.fun.controller.MainController;
/**
 * 测试本地注入
 * @author liuzhangjun
 *
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("加载spring成功");
		MainController mainController = context.getBean(MainController.class);
		System.out.println("debug");
	}
}
