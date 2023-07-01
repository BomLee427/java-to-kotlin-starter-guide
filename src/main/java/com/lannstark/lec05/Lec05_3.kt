package com.lannstark.lec05

/**
 * 3. switch와 when
 */

/**
 * switch문은 사라지고 대신 when을 쓴다.
 */
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) { /// expression이므로 리턴할 수 있다.
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..100 -> "A" /// 더 다양한 조건으로 분기를 설정할 수 있다.
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/**
 * when의 구조
 *
 * when(값) {
 *      조건문 -> 구문   /// 어떠한 expression이라도 들어갈 수 있다.
 *      조건문 -> 구문   /// 동시에 여러개의 조건을 검사할 수 있다.
 *      else -> 구문
 * }
 */
fun startsWithAWithWhen(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")  /// 어떤 experssion이라도 들어갈 수 있다.
                                                /// 복습! smart cast. is로 타입을 검사했다면 바로 형변환이 가능하다.
        else -> false
    }
}

fun judgeNumber(number: Int): Boolean {
    return when (number) {
        1, 0, -1 -> true /// 여러 개의 조건을 ,로 검사 가능하다.
        else -> false
    }
}

fun judgeNumber2(number: Int) {
    when { /// when에는 값이 없을 수도 있다.
        number == 0 -> println("0") /// Java의 early return처럼 동작한다.
        number % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}