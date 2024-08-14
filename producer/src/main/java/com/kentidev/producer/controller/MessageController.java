package com.kentidev.producer.controller;

import com.kentidev.producer.kafka.config.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {
  private final KafkaProducer kafkaProducer;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createMessage(@RequestBody String message) {
    kafkaProducer.send(message);
  }


}