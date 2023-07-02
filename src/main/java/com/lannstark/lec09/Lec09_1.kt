package com.lannstark.lec09

/**
 * 코틀린에서 클래스를 다루는 방법
 * 1. 클래스와 프로퍼티
 */
fun main() {
    val person = Person("이보미", 100)
    println(person.name) /// getter 대신 필드에 바로 접근
    person.age = 10 /// setter 대신 필드에 바로 접근
    println(person.age)

    /**
     * 자바 클래스에 대해서도 getter, setter 대신 .필드 구문을 사용할 수 있다.
     */

    val javaPerson = JavaPerson("이보미", 100)
    println(javaPerson.name)
}

class Person( /// 생성자는 클래스명 옆에 써줌
    val name: String,
    var age: Int /// 생성자에서 바로 필드 선언 가능
)
// { /// body 내용이 없으면 중괄호 선언 가능

    /**
     * /// 프로퍼티: 필드 + getter + setter
     * 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어 준다.
     */
//    val name = name
//    var age = age
//}