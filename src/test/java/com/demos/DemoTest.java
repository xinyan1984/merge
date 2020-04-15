package com.demos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTest {

  @Test
  public void add() {
  }

  @Test
  public void merge() {

    List<Map<String, Object>> list1 = new ArrayList<>();
    List<Map<String, Object>> list2 = new ArrayList<>();
    Map<String, Object> objectMap = new HashMap<>();
    objectMap.put("id", "4");
    objectMap.put("name", "tudou");

    Map<String, Object> objectMap1 = new HashMap<>();
    objectMap1.put("id", "5");
    objectMap1.put("name", "xigua");

    Map<String, Object> objectMap2 = new HashMap<>();
    objectMap2.put("id", "5");
    objectMap2.put("price", "2.0");
    Map<String, Object> objectMap3 = new HashMap<>();

    objectMap3.put("id", "6");
    objectMap3.put("price", "7");
    list1.add(objectMap);
    list1.add(objectMap1);

    list2.add(objectMap3);
    list2.add(objectMap2);

    List<Map<String, Object>> result = Demo.merge(list1, list2, "id");
    for (int j = 0; j < result.size(); j++) {
      System.out.println(result.get(j).toString());
    }
  }
}