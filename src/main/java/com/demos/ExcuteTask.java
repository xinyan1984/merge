package com.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ExcuteTask {

  List<PointThread> listArray = new ArrayList<PointThread>();
  HashMap<String, PointThread> hashMap = new HashMap<String, PointThread>();

  public void initData() {
    HashMap<Integer, PointThread> hashMap = new HashMap<Integer, PointThread>();

    PointThread A = new PointThread("A");
    PointThread B = new PointThread("B");
    PointThread C = new PointThread("C");
    PointThread D = new PointThread("D");
    PointThread E = new PointThread("E");
    PointThread F = new PointThread("F");
    PointThread G = new PointThread("G");

    listArray.add(A);
    hashMap.put(1, D);
    A.next = hashMap;

    hashMap.clear();
    hashMap.put(1, D);

    listArray.add(C);
    listArray.add(D);
    listArray.add(E);
    listArray.add(F);
  }

  public void excuteTask() {
    int max = listArray.size();
    Stack<PointThread> stack = new Stack<PointThread>();
    for (int i = 0; i < max; i++) {
      PointThread tmpPoint = listArray.get(i);
      if (tmpPoint.previous == null) {
        stack.push(tmpPoint);
      }
    }


    do {
      Stack<PointThread> stacknew = new Stack<PointThread>();
      PointThread tmp = stack.pop();
      if (tmp.previous == null) {
        tmp.run();
        PointThread tmpNext = tmp.next.get(0);
        tmpNext.previous = null;
        tmp = null;
        if (tmpNext.next.size() == 1) {
          stacknew.push(tmp);
        } else if (tmpNext.next.size() > 1) {
          for (int i = 0; i < tmpNext.next.size(); i++)
            stacknew.push(tmpNext.next.get(i));
        }
      }
      if (stack.isEmpty()) stack = stacknew;
    } while (!stack.isEmpty());
  }

}
