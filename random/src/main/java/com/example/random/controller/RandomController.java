package com.example.random.controller;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RandomController {

  @GetMapping(value = "/number")
  public ResponseEntity<Map<String, Integer>> number() {
    log.info("RandomController");
    Map<String, Integer> message =
        Collections.unmodifiableMap(
            Stream.of(new AbstractMap.SimpleEntry<>("message", getRandomNumber()))
                .collect(Collectors.toMap((o) -> o.getKey(), (o) -> o.getValue())));
    return ResponseEntity.ok(message);
  }

  private Integer getRandomNumber() {
    return ThreadLocalRandom.current().nextInt(1, 101);
  }
}
