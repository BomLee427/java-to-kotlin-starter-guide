package com.lannstark.lec05

/**
 * 2. Expression과 Statement
 */


/**
 * /// Java의 if-else는 Statement
 * /// Kotlin에서의 if-else는 Expression
 *
 * statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다
 * expression: 하나의 값으로 도출되는 문장
 * 즉, 자바의 if-else는 변수에 담을 수 없지만 코틀린은 가능하다.
 *
 * 자바는 이런 상황을 해결하기 위해 삼항 연산자를 사용하지만
 * 코틀린에서는 필요없기 때문에 삭제되었다.
 */

fun getPassOrFailAsIfExpression(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

/**
 * if-else if-else도 동일
 */
fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

/**
 * Tip!
 * 어떠한 값이 특정 범위에 포함되어 있는지 알아볼 때
 */
fun validateScoreIsNotNegative2(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("점수 ${score}가 0보다 작거나 100보다 큽니다.")
    }
}