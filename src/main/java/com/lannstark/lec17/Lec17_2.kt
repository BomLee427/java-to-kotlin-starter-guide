package com.lannstark.lec17

/**
 * 2. Closure
 */

/**
 * 자바에서는 람다 밖에 있는 변수를 쓰기 위해서는 final, 혹은 실질적 final(변수 값이 변경되지 않음)이어야 한다.
 */

fun main() {

    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName } /// 코틀린에서는 값이 바뀌는 변수라도 문제 없이 동작한다.
}
/**
 * Closure
 * - 코틀린은 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
 * - 람다가 사용되는 시점에 람다가 갖고 있는 변수들을 모두 갖고 있어야만 람다를 진정한 1급 시민으로 쓸 수 있다.
 */
