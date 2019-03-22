package com.example.kafkaproducer.service;

import com.example.kafkaproducer.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC = "home";

    @Autowired
    public UserService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendJohn() {
        this.kafkaTemplate.send(TOPIC, new User(1L, "John", "020.315.602.12"));
    }

}
