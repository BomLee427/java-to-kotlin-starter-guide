package com.lannstark.lec03

/**
 * Kotlin에서 Type을 다루는 방법
 * 1. 기본 타입
 */

fun main() {

    /**
     * 코틀린은 타입을 명시하지 않으면 선언된 기본값을 보고 타입을 추론한다.
     */
    val number1 = 3 /// int
    val number2 = 3L /// long
    val number3 = 3.0f /// Float
    val number4 = 3.0 /// double

    /**
     * Java: 기본 타입간의 변환은 암시적으로 이루어질 수 있다.
     * Kotlin: 기본 타입간의 변환은 명시적으로 이루어져야 한다.
     */
    /// 큰 타입이라 할지라도 자동 형변환이 되지 않는다.
    val number5 = 4
    // val number6: Long = number1 /// Not OK. Type mismatch
    val number6: Long = number1.toLong() /// OK

    /// Java에서는 (double) number8 등으로 처리했던 것을 .toDouble()로 해결한다.
    val number7 = 3
    val number8 = 5
    val result1 = number7 / number8 /// int
    val result2 = number7 / number8.toDouble() /// double

    /**
     * nullable 변수일 경우 적절한 처리가 필요하다.
     */
    val number9: Int? = 3
    val number10: Long = number9?.toLong() ?: 0L

}
