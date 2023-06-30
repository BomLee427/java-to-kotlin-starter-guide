package com.lannstark.lec03;

public class Lec03Main {

  public static void main(String[] args) {
    int number1 = 4;
    long number2 = number1; /// 기본 타입 간의 암시적 변환이 가능하다.

    /// String interpolation / String indexing

    Person person = new Person("좋은 개발자", 100);
    String log = String.format("사람의 이름은 %s이고 나이는 %s세입니다.", person.getName(), person.getAge());

    StringBuilder sb = new StringBuilder();
    sb.append("사람의 이름은");
    sb.append(person.getName());
    sb.append("이고 나이는");
    sb.append(person.getAge());
    sb.append("세입니다.");
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

}
