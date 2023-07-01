package com.lannstark.lec08

/**
 * 4. 같은 타입의 여러 파라미터 받기(가변인자)
 */
fun main() {

    var array = arrayOf("A", "B", "C")

    printAll(*array) /// 용열을 바로 넣지 않고 spread 연산자 사. 배열 안의 것들을 꺼내준다.
    printAll("A", "B", "C") /// OK
}

/**
 * 문자열을 먼저 받아 출력하는 예제
 */
fun printAll(vararg strings: String) { /// 자바의 ... 대신 vararg 키워드를 쓴다.
    for (str in strings) {
        println(str)
    }
}
