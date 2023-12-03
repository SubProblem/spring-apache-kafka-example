package com.subproblem.consumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.subproblem.consumer.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "test", groupId = "myGroup")
    public void consumeMessage(User user) {
      log.info("Consuming message: " + user);
    }
}
