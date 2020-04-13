package com.demos;

import java.util.ArrayList;
import java.util.List;

public class ExcuteTask {

  List<PointThread> list = new ArrayList<PointThread>();

  //二维数组存放节点
  PointThread[][] ss = new PointThread[2][5];


  public void initData() {
    String initCharater = "A";
    for (int i = 0; i < 8; i++) {
      list.add(new PointThread(initCharater + i));
    }

    for (int i = 0; i < 2; i++) {


    }

  }


  //取二维数组中节点来执行，通过控制流程
  // t1.start();
  //        t1.join();
  //        t2.start();
  //        t2.join();
  //        t3.start();


}
