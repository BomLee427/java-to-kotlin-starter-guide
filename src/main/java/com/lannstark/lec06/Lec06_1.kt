package com.lannstark.lec06

/**
 * 코틀린에서 반복문을 다루는 방법
 * 1. for-each문 (향상된 for문)
 */

fun main() {

    /**
     * 숫자가 들어 있는 리스트를 하나씩 출력하는 예제
     */
    val numbers = listOf(1L, 2L, 3L) /// 컬렉션을 만드는 메서드
    for (number in numbers) { /// : 대신 in을 사용. iterable이 구현된 클래스는 모두 사용 가능하다.
        println(number)
    }

}
