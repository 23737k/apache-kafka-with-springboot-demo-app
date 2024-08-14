package com.kentidev.consumer.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
  @KafkaListener(topics = "myTopic", groupId = "myGroup")
  public void listen(String message) {
    log.info(message);
  }


}
