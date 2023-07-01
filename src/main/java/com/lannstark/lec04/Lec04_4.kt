package com.lannstark.lec04

/**
 * 4. 연산자 오버로딩
 * - 코틀린에서는 객체마다 연산자를 직접 정의할 수 있다.
 */

fun main() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2) /// 연산자 오버로딩
}