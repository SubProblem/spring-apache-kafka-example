package com.subproblem.producer.controller;

import com.subproblem.producer.dto.MockData;
import com.subproblem.producer.entity.User;
import com.subproblem.producer.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/producer")
public class ProducerController {

    private final Producer producer;

    @PostMapping
    public void getData(@RequestBody List<MockData> data) {

        List<User> users = data.stream()
                .map(u -> User.builder()
                        .firstname(u.firstname())
                        .lastname(u.lastname())
                        .age(u.age())
                        .build())
                .toList();

        users.forEach(user -> {
                    try {
                        Thread.sleep(1000);
                        producer.sendMessage(user);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

    }
}
