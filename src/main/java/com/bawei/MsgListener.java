package com.bawei;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

//监听类
public class MsgListener implements MessageListener<String, String>{

	@Override
	public void onMessage(ConsumerRecord<String, String> data) {
		String value = data.value();
		System.out.println("收到的消息"+value);
	}

}
