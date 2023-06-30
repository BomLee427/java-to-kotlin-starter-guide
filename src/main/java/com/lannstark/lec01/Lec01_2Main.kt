package com.lannstark.lec01

/**
 * 2. Kotlin에서의 Primitive Type
 */
fun main() {

    /**
     * 코틀린에서의 원시 타입과 참조 타입
     *
     * "숫자, 문자, 불리언과 같은 몇몇 타입은 내부적으로 특별한 표현을 갖는다.
     *  이 타입들은 실행 시 원시 타입으로 표현되지만, 코드에서는 평범한 클래스처럼 보인다."
     *  - 코틀린 공식 문서 중
     *
     *  즉 상황에 따라 코틀린이 알아서 원시 타입과 참조 타입으로 연산한다.
     *  따라서 프로그래머는 Boxing, Unboxing을 고려하지 않아도 괜찮다.
     */
    var number1 = 10L
    var number3 = 1_000L /// 자바 코드로 변환해 보면 원시 타입으로 컴파일되었음을 알 수 있다.

    /**
     * Tip!
     * Tools -> Kotlin -> Show Kotlin Bytecode -> Decompile 버튼 클릭
     * 코틀린 코드를 자바 코드로 변환해볼 수 있다.
     */
}
