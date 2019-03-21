package com.example.kafkaproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
@EmbeddedKafka(
        partitions = 1,
        topics = {KafkaProducerApplicationTests.HELLOWORLD_TOPIC}
)
public class KafkaProducerApplicationTests {

    static final String HELLOWORLD_TOPIC = "helloworld";

    @Autowired
    private Sender sender;

    @Test
    public void testReceive() {
        sender.send("Hello Spring Kafka!");
    }

}
