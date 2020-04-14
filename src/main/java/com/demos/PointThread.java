package com.demos;

import java.util.Stack;

public class PointThread {

  public Stack<PointThread> getNext() {
    return next;
  }

  public void setNext(Stack<PointThread> next) {
    this.next = next;
  }

  public Stack<PointThread> getPrevious() {
    return previous;
  }

  public void setPrevious(Stack<PointThread> previous) {
    this.previous = previous;
  }

  public Stack<PointThread> next;
  public Stack<PointThread> previous;
  private String threadName = "";


  public PointThread(String threadName) {
    this.threadName = threadName;
  }


  public void run() {
    System.out.println(threadName);
  }
}
