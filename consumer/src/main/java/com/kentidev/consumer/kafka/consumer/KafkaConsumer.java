package com.kentidev.consumer.kafka.consumer;

import com.kentidev.consumer.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
  @KafkaListener(topics = "myTopic", groupId = "myGroup")
  public void listen(Student student) {
    log.info(student.toString());
  }


}
