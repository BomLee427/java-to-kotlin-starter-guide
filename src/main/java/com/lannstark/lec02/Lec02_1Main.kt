package com.lannstark.lec02

/**
 * 02. 코틀린에서 null을 다루는 방법
 * 1. Kotlin에서의 null 체크
 */

fun startsWithA(str: String): Boolean { /// str을 null이 아예 들어올 수 없는 타입으로 간주하고 메소드콜 시 오류를 발생시키지 않는다.
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("Null not allowed")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A") /// null 체크를 하였다면 컴파일러가 null-safe 변수로 추론하고, String(? 없음) 타입으로 캐스트한다.
}

//fun startsWithA4(str: String?): Boolean {
//    return str.startsWith("A") /// nullable 변수에서 바로 메서드콜을 하면 컴파일러가 오류를 발생시킨다.
//}