package com.lannstark.lec01

/**
 * 코틀린에서 변수를 다루는 방법
 * 1. 변수 선언 키워드 - `var`과 `val`의 차이점
 */
fun main() {

    /**
     * 모든 변수 선언 시 var/val을 붙여 주어야 한다.
     */
    var number1 = 10L // LEC: 가변 변수. variable
    number1 = 5L

    val number2 = 10L // LEC: 불변 변수. value
    // number2 = 10L // LEC: Not OK. val cannot be reassigned


    /**
     * 코틀린 컴파일러는 타입 추론을 지원한다.
     * 프로그래머가 타입을 명시적으로 작성하지 않아도 추론 가능하다.
     */
    var number3 : Long = 11L; // LEC: OK
    var number4 = 11L; // LEC: OK

    /**
     * 변수를 초기화하지 않는다면?
     */
    // var number5 // LEC: Not OK. 컴파일러가 타입 추론을 할 수 없기 때문
    var number6: Long // LEC: OK. 컴파일러가 변수의 타입을 알 수 있음
    // println(number6) // LEC: Not OK. 값이 초기화되지 않았기 때문

    // val number7 // LEC: Not OK
    val number8: Long
    number8 = 10L // LEC: OK. 초기화되지 않은 val에 한해 "최초 1회" 값을 넣어줄 수 있다.

    /**
     * val 컬렉션에는 Element를 추가할 수 있다.
     * cf. 자바 컬렉션을 immutable하게 하기: https://unluckyjung.github.io/java/2021/02/20/Java-Unmodifiable/
     */

    /**
     * Tip!
     * 클린 코드를 위해서는 모든 변수를 우선 val로 만들고 필요한 경우에만 var로 변경한다. (js의 const-let-val과 비슷!)
     */

}
