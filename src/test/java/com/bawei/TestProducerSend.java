package com.bawei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:producer.xml")
public class TestProducerSend {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	@Test
	public void testSend() {
		kafkaTemplate.send("1710f", "Java发送的消息！！！");
	}
}
