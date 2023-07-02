package com.lannstark.lec09;

public class JavaPerson {

  private final String name;
  private int age;

  public JavaPerson(String name, int age) {
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다", age));
    }
    this.name = name;
    this.age = age;
  }

  public JavaPerson(String name) {
    this(name, 1);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  /// Name에는 setter가 없다. (불변)
  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 20;
  }

}

