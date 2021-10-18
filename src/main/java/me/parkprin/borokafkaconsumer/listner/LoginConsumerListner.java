package me.parkprin.borokafkaconsumer.listner;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.parkprin.borokafkaconsumer.dto.LoginResult;
import me.parkprin.borokafkaconsumer.dto.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginConsumerListner {

	private final ObjectMapper objectMapper ;

	@KafkaListener(topics = "#{'${spring.kafka.consumer.topic.name}'}", groupId = "#{'${spring.kafka.consumer.topic.group-id}'}")
	public void consume(String message) throws IOException{
		log.info(message);
		LoginResult loginResult = objectMapper.readValue(message, LoginResult.class);
		log.info(loginResult.getUserId());
		log.info(loginResult.getMenuAuth().toString());
	}
}
