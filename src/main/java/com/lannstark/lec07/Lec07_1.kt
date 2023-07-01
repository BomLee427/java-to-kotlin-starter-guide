package com.lannstark.lec07

/**
 * 코틀린에서 예외를 다루는 방법
 * 1. try catch finally
 */

/**
 * 문자열을 정수로 변경하는 예제 1
 * 실패 시 예외 발생
 */
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt() /// 복습! 기본 타입간의 변환은 toType()을 사용한다.
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}는 숫자가 아닙니다.")
    }
}
/// try-catch 자체는 동일하다!

/**
 * 문자열을 정수로 변경하는 예제 2
 * 실패 시 null 반환
 */
fun parseIntOrNull(str: String): Int? {
    return try { /// try-catch문은 Expression으로 간주됨
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
/// try-catch-finally 역시 동일
