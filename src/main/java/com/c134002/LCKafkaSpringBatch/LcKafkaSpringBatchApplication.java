package com.c134002.LCKafkaSpringBatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class LcKafkaSpringBatchApplication {

	@Autowired
	private KafkaTemplate<String, Object> template;
	private String topic = "cavalcanti";
	@GetMapping("/publish/{name}")
	public  String publishMessage(@PathVariable String name) {
		template.send(topic, "Hi "+name+",  Welcome to Leo Cavalcantis Kafka Project" );
		return "Data published by L.Cavalcanti";
	}

	@GetMapping("/publishJson")
	public  String publishMessage() {
		User user = new User(2532, "UserEva", new String[] {"Avenida Paulista","000", "Sao Paulo, Brazil"});
		template.send(topic, user);
		return "Json Data Published";


	}




	public static void main(String[] args) {

		SpringApplication.run(LcKafkaSpringBatchApplication.class, args);
	}

}
