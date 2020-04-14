package com.demos;

import java.util.HashMap;

public class PointThread {


  public HashMap<Integer, PointThread> getNext() {
    return next;
  }

  public void setNext(HashMap<Integer, PointThread> next) {
    this.next = next;
  }

  public HashMap<Integer, PointThread> getPrevious() {
    return previous;
  }

  public void setPrevious(HashMap<Integer, PointThread> previous) {
    this.previous = previous;
  }

  public HashMap<Integer, PointThread> next;
  public HashMap<Integer, PointThread> previous;
  private String threadName = "";
  private int weight = 1;


  public PointThread(String threadName) {
    this.threadName = threadName;
  }


  public void run() {
    System.out.println(threadName);
  }
}
