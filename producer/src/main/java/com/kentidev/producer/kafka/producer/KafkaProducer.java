package com.kentidev.producer.kafka.producer;

import com.kentidev.producer.kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
  private final KafkaTemplate<String, Student> kafkaTemplate;

  public void send(Student student) {
    kafkaTemplate.send("myTopic", student);

    log.info("Sending message: {}", student.toString());

  }
}
