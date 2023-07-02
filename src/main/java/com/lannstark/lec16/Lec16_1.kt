package com.lannstark.lec16

/**
 * 코틀린에서 다양한 함수를 다루는 방법
 * 1. 확장함수
 */

/**
 * 확장함수의 배경
 * - 코틀린은 자바와 100% 호환하는 것을 목표로 한다.
 * - 기존 자바 코드 위에 자연스럽게 코틀린 코드를 추가할 수는 없을까?
 *
 * -> 클래스 안에 있는 것처럼 호출할 수 있되, 코드 자체는 밖에 존재하는 함수를 만들자.
 */

/**
 * 확장함수를 작성하는 법
 */
fun String.lastChar(): Char { /// 수신객체 타입: 함수이름 앞에 클래스명. 을 붙인다.
    return this[this.length - 1] /// 수신객체: 확장 대상 클래스(String)를 통해 함수가 불려질 것이므로, 함수를 호출한 인스턴스를 this 키워드로 호출한다.
}

fun main() {
    /**
     * 확장함수의 특징
     * - 확장함수에서는 클래스의 캡슐화가 깨지는 것을 방지하기 위해 private 또는 private 멤버를 가져올 수 없다.
     * - 확장함수와 멤버함수의 시그니처가 같다면, 멤버함수가 우선적으로 호출된다.
     * - 확장함수가 override된다면, 변수에 선언된 타입(정적인 타입)에 의해 어떤 확장함수가 호출될지 결정된다.
     * - 자바에서 코틀린의 확장함수를 사용할 때는 정적 메소드를 부를 때처럼 사용한다.
     */

    val str = "ABC"
//    println(str.lastChar()) /// 마치 클래스 안에 함수가 존재하는 것처럼 바로 확장함수를 호출할 수 있다.

    val person = Person("보미", "이", 100)
//    println(person.nextYearAge()) /// 확장함수와 멤버함수의 시그니처가 같다면 멤버함수를 우선 호출한다.

    val srt1 = Srt() /// Srt의 확장함수가 불려짐
    val srt2: Train = Srt() /// Train의 확장함수가 불려짐
    val train = Train() /// Train의 확장함수가 불려짐
//    println(srt1.isExpensive())
//    println(srt2.isExpensive())
//    println(train.isExpensive())
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

open class Train(val name: String = "새마을호", val price: Int = 5_000)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("SRT의 확장함수")
    return this.price >= 10000
}
/**
 * 확장 프로퍼티
 * - 확장함수 + custom getter
 */
val String.lastChar: Char   /// 수신 객체 타입
    get() = this[this.length - 1]   /// 수신 객체
