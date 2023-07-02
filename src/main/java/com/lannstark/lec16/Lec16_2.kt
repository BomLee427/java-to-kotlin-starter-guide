package com.lannstark.lec16

/**
 * 코틀린에서 다양한 함수를 다루는 방법
 * 2. infix 함수(중위함수)
 */

fun main() {
    println(1.add(3))
    println(1.add2(3))
    println(1 add2 3)
}

/**
 * 아예 다른 함수가 아닌, 함수를 호출하는 새로운 방법. /// 복습! 6강의 반복문에서 사용한 downTo, step
 *
 * 변수, 매개변수가 각각 하나인 경우에 대해,
 * "변수.함수이름(매개변수)"가 아니라,
 * "변수 함수이름 매개변수" 와 같은 식으로 호출하게 하는 것.
 */

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int { /// 중위함수 키워드 infix
    return this + other
}
