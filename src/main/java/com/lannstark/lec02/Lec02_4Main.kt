package com.lannstark.lec02

/**
 * 4. 플랫폼 타입
 * - Kotlin에서 Java 코드를 가져와 사용할 때 어떻게 처리할까
 */
fun main() {
    val person = Person("열심히 공부하는 개발자") /// 복습! new 연산자를 쓰지 않는다.

    /**
     * 코틀린이 자바 코드를 가져올 때, null에 대한 어노테이션 정보를 코틀린이 이해할 수 있다.
     * 이 때 어노테이션이 없다면 코틀린은 해당 필드의 nullable 정보를 알 수 없다.
     * 이러한 타입을 "플랫폼 타입" 이라고 부르고, 런타임 시 예외가 발생할 수 있다.
     */
    startsWithA6(person.name) /// person의 getName()에 @Nullable을 사용하면 오류가 발생한다.
}

/**
 * 코틀린에서 자바 코드를 사용할 때는 자바 코드에 null 관련 정보를 꼼꼼히 기입하는 게 좋고,
 * 그럴 수 없는 경우(외부 라이브러리 등)에는 해당 코드의 null 관련 정보를 꼼꼼히 확인해야 한다.
 * 또, 코틀린이 자바 코드를 가져오는 지점을 단일 지점으로 만듦으로써 관리를 용이하게 만드는 것이 좋다.
 */

fun startsWithA6(str: String): Boolean {
    return str.startsWith("A")
}