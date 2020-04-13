package com.demos;

public class PointThread implements Runnable{
  public int lenth;
  public PointThread first;
  public PointThread second;
  private String threadName = "";

  public PointThread(int lenth, PointThread first, PointThread second) {
    this.lenth = lenth;
    this.first = first;
    this.second = second;
  }

  public PointThread(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    System.out.println(threadName);

  }
}
