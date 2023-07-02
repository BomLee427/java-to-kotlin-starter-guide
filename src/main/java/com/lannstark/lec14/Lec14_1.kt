package com.lannstark.lec14

/**
 * 코틀린에서 다양한 클래스를 다루는 방법
 * 1. Data Class
 */

fun main() {
    val dto1 = PersonDto("이보미", 100)
    val dto2 = PersonDto("이보미", 200)
    val dto3 = PersonDto("이보미", 100)

    println(dto1)           /// toString
    println(dto1 == dto2)   /// false. 복습! ===는 주소비교, ==는 equals
    println(dto1 == dto3)   /// true
}

/**
 * 계층간 데이터를 전달하기 위한 DTO
 * 데이터, 생성자와 getter, equals, hashCode, toString 등을 갖고 있음
 */

/**
 * Data class
 * equals, hashCode, toString을 자동으로 만들어준다.
 */
data class PersonDto(
    val name: String,
    val age: Int,
)
/**
 * Tip!
 * 여기에 named argument까지 사용하게 되면 builder patter의 효과까지 함께 사용할 수 있음.
 */

/**
 * Java에서도 JDK16부터 record class를 도입
 */