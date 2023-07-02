package com.lannstark.lec12

/**
 * 3. 익명 클래스
 */

/**
 * 익명 클래스: 특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스
 */

fun main() {
    moveSomthing(object : Movable { /// object : Type 을 이용해 익명클래스를 구현한다.
        override fun move() {
            println("허둥지둥")
        }
        override fun fly() {
            println("파닥파닥")
        }
    })
}

private fun moveSomthing(movable: Movable) {
    movable.move()
    movable.fly()
}
