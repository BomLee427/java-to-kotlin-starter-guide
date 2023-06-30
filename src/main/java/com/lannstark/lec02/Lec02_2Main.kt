package com.lannstark.lec02

/**
 * 2. Safe Call과 Elvis 연산자
 * - null이 가능한 타입만을 위한 기능들
 */
fun main() {

    val str: String? = "ABC"

    /**
     * Safe Call
     */
    // str.length /// Not OK
    str?.length /// OK. null이 아니면 실행하고, null이면 실행하지 않는다(그대로 null).

    /**
     * Elvis 연산자
     */
    str?.length ?: "It is null" /// 연산 결과가 null이면 뒤의 값을 사용.
}

/**
 * 2-1에서 작성한 함수를 조금 더 코틀린스럽게 바꿔 보자.
 */
fun startsWithA1Refactor(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("Null not allowed")
}

fun startsWithA2Refactor(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3Refactor(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

/**
 * Elvis 연산은 Early return validation에도 사용할 수 있다.
 * ex: number ?: return 0
 */