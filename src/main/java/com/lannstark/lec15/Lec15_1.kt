package com.lannstark.lec15

/**
 * 코틀린에서 배열과 컬렉션을 다루는 방법
 * 1. 배열
 */

fun main() {

    /**
     * 배열 초기화: arrayOf()
     */
    val array = arrayOf(100, 200)

    /**
     * 배열과 반복문 활용
     */
    for (i in array.indices) {  /// 0~lastIndex까지의 IntRange 생성
        println("${i} : ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} : ${value}")
    }

    array.plus(300) /// array에 쉽게 배열을 추가할 수 있음
}
