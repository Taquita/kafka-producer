package com.example.kafkaproducer.service;

import com.example.kafkaproducer.domains.Phone;
import com.example.kafkaproducer.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC = "home";

    @Autowired
    public UserService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendJohn() {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(1L, "92994818768"));
        this.kafkaTemplate.send(TOPIC, new User(1L, "John", "020.315.602.12", phones));
    }

}
