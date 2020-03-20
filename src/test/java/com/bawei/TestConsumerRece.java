package com.bawei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//启动消费者的类
public class TestConsumerRece {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:consumer.xml");
		 
	}
}
