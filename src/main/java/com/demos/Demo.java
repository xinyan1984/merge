package com.demos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

  public static List<Map<String, Object>> merge(List<Map<String, Object>> List1, List<Map<String, Object>> List2, String filedName) {
    Map<String, Map<String, Object>> map = new HashMap<>();
    int len1 = List1.size();
    int len2 = List2.size();

    for (int i = 0; i < len1; i++) {
      Map<String, Object> tmpMap = List1.get(i);
      map.put(tmpMap.get(filedName).toString(), tmpMap);
    }

    for (int i = 0; i < len2; i++) {
      Map<String, Object> tmp = List2.get(i);
      if (map.containsKey(tmp.get(filedName))) {
        Map<String, Object> map1 = map.get(tmp.get(filedName));
        map1.putAll(tmp);
      }
    }
    return List1;
  }

}
