package com.ckyeon.springtutorial.todo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

  @GetMapping("/test")
  public Map<String, String> test() {
    System.out.println("API 테스트!!");
    HashMap<String, String> map = new HashMap<>();
    map.put("테스트!!", "테스트 성공!!");
    return map;
  }
}
