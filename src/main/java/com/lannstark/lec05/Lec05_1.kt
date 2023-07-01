package com.lannstark.lec05

/**
 * 코틀린에서 조건문을 다루는 방법
 * 1. if
 */

/**
 * if: /// same
 */
fun validateScoreIsNotNegative(score: Int) { /// Unit(void)은 생략
    if (score < 0) {
        throw IllegalArgumentException("score ${score}는 0보다 작을 수 없습니다.")
    }
}

/**
 * else: /// same
 */
fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}
