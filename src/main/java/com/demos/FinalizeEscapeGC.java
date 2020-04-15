package com.demos;

/**
 * 执行结果：
 */
public class FinalizeEscapeGC {
  public static FinalizeEscapeGC instance = null;

  public void isAlive() {
    System.out.println("yes,i am still alive");
  }

  @Override
  protected void finalize() throws Throwable {
   // super.finalize();
    System.out.println("finalize methode executed");
    instance = this;
  }

  public static void main(String[] args) throws InterruptedException {
    instance = new FinalizeEscapeGC();

    instance = null;
    System.gc();
    Thread.sleep(1000);
    instance.isAlive(); //在没有重写finalize方法时，肯定是会报nullpointerException的

    instance = null;
    System.gc();
    Thread.sleep(1000);
    if (instance == null) {
      System.out.println("i am dead;");

    } else {
      System.out.println("i am still  live ;");
    }

  }
}