package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
     Person.Factory.newBaby("ABC"); /// 이름이 있는 동반클래스일 경우
//     Person.Companion.newBaby("ABC"); /// 익명 동반클래스일 경우
    Person.newBaby("ABC");  /// @JvmStatic 사용 시
  }

}
