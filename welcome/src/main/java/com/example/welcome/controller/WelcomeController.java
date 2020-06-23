package com.example.welcome.controller;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WelcomeController {

  @GetMapping(value = "message")
  public ResponseEntity<Map<String, String>> welcome() {
    log.info("WelcomeController");
    Map<String, String> message =
        Collections.unmodifiableMap(
            Stream.of(new AbstractMap.SimpleEntry<>("message", "Hello World!"))
                .collect(Collectors.toMap((o) -> o.getKey(), (o) -> o.getValue())));
    return ResponseEntity.ok(message);
  }
}
