package com.kentidev.producer.kafka.payload;

import lombok.Data;

@Data
public class Student {
  private Long id;
  private String firstName;
  private String lastName;
}
