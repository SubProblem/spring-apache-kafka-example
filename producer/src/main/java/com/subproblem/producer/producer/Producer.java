package com.subproblem.producer.producer;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.subproblem.producer.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {

    private final KafkaTemplate<String, User> kafkaTemplate;



    public void sendMessage(User user) {

        kafkaTemplate.send("test", user);
    }
}
