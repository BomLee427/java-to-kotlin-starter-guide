package com.lannstark.lec06

/**
 * 2. 전통적인 for문
 */

fun main() {
    /**
     * 1부터 3까지 출력하는 예제
     */
    for (i in 1..3) { /// .. 연산자를 사용
        println(i)
    }

    /**
     * 감소하는 경우
     */
    for (i in 3 downTo 1) {
        println(i)
    }

    /**
     * 2씩 증가하는 경우
     */
    for (i in 1..5 step 2) {
        println(i)
    }

    /**
     * 2씩 감소하는 경우
     */
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
}
