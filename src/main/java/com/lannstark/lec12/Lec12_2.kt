package com.lannstark.lec12

/**
 * 2. 싱글톤
 */

fun main() {

    println(Singleton.a)    /// 단일 인스턴스이므로 클래스명만으로 바로 값을 가져올 수 있다.
    Singleton.a += 10
    println(Singleton.a)
}

/**
 *
 * 자바에서는 보통 static 영역에 instance 자체를 변수로 선언하여
 * 팩토리 메서드를 통해 그 인스턴스를 가져오는 방식으로 구현.
 *
 * 여기에 동시성 처리를 조금 더 하거나, (https://javaplant.tistory.com/21)
 * Enum class를 활용하는 방법도 있었다. (https://scshim.tistory.com/361)
 */

/**
 * 코틀린에서 싱글톤을 만드는 방법
 */
object Singleton {
    var a: Int = 0
}    /// object 키워드를 붙이면 singleton 클래스가 만들어진다.
