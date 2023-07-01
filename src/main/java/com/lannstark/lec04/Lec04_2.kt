package com.lannstark.lec04

/**
 * 2. 비교 연산자와 동등성, 동일성
 */

/**
 * 비교 연산자
 * >, <, >=, <=
 * /// 산술 비교 시, ALL SAME
 */

fun main() {

    /**
     * 코틀린은 객체 비교 시 Java와 다르게 자동으로 compareTo를 호출
     */

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 크다.")
    }

    /**
     * 동등성과 동일성
     * - 동등성(Equality): 두 객체의 값이 같은가
     * - 동일성(Identity): 완전히 동일한 객체인가(주소가 같은가)
     *
     * Java에서는 동일성에 ==를 사용하고, 동등성에 equals를 호출함
     * Kotlin에서는 동일성에 ===를, 동등성에 ==를 사용
     * ==를 사용하면 간접적으로 eqals를 호출한
     */

    val money3 = money2
    val money4 = JavaMoney(1_000L)

    println(money2 === money3) /// true. Identity 비교
    println(money2 == money4) /// true. Equality 비교
    println(money2 === money4) /// false. Identity 비교

}