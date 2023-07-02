package com.lannstark.lec09

/**
 * 2. 생성자와 Init
 */
fun main() {
    Person2()
    /**
     * 초기화 블록 -> 첫번째 부생성자 -> 두번째 부생성자 순으로 실행됨
     * 즉, 바디는 역순
     *
     * 최초 호출한 것은 두번째 부생성자이나, 순서대로 처음까지 타고 올라가 초기화 블럭부터 실행됨.
     */

    /**
     * 코틀린은 부생성자보다는 default parameter를 권장
     * Converting과 같은 경우 부생성자를 사용할 수는 있지만,
     * 정적 팩토리 메서드를 사용하는 것이 더 낫다.
     */
}

/**
 * 주 생성자(primary constructor)
 * - 반드시 존재해야 한다.
 * - 파라미터가 하나도 없는 경우에는 생략 가능하다.
 *
 * 부 생성자(secondary constructor)
 * - 있을 수도 있고, 없을 수도 있다.
 * - 최종적으로 주 생성자를 this 키워드로 호출해야 한다.
 * - body를 가질 수 있다.
 */
class Person2(
    val name: String,
    val age: Int
) {
    init { /// init: 클래스 초기화 시 1회 호출되는 블록
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor(): this("김길동") {
        println("두번째 부생성자")
    }
}
