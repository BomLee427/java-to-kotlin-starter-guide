package com.lannstark.lec01

/**
 * 3. Kotlin에서의 nullable 변수
 */
fun main() {

    /**
     * 코틀린에서는 nullable 자체를 아예 다르게 간주한다.
     * 변수 선언 시 '타입?'를 사용해 nullable 여부를 선언해야 한다.
     * 이는 '타입'과 아예 다른 타입으로 간주된다.
     */
    // var number1 = 1_000L /// Not OK. 기본적으로 모든 변수는 Not null로 간주한다.
    var number1: Long? = 1_000L /// OK. 타입 뒤에 ?(물음표)를 붙이면 nullable 변수가 된다.
    number1 = null
}
