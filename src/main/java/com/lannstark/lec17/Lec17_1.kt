package com.lannstark.lec17

import java.util.*

/**
 * 코틀린에서 람다를 다루는 방법
 * 1. 코틀린에서의 람다
 */

/**
 * 코틀린의 함수는 1급시민
 * - 코틀린에서는 함수가 그 자체로 값이 될 수 있다.
 * - 변수에 할당할 수도 있고, 파라미터로 넘길 수도 있다.
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

    /**
     * 변수에 함수를 할당하는 두 가지 방법
     */
    val isApple1 = fun(fruit: Fruit): Boolean { /// 함수명이 존재하지 않는다(익명함수=람다).
        return fruit.name == "사과"
    }

    val isApple2 = { fruit: Fruit -> fruit.name == "사과" } /// 화살표 함수 문법

    /**
     * 변수에 할당된 함수를 사용하는 두 가지 방법
     */
    isApple1(fruits[0])
    isApple2.invoke(fruits[0]) /// 명시적으로 invoke를 작성

    /**
     * 람다(익명함수)에도 타입이 있다.
     */
    val isApple3: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" } /// (Fruit) -> Boolean 타입
    /// 즉, Fruit를 받아 Boolean을 반환하는 타입

    filterFruits(fruits, isApple1) /// 함수 자체를 파라미터로 보낼 수 있다!
//  filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" }) /// 변수 선언 없이도 가능하다.
    filterFruits(fruits) { fruit -> fruit.name == "사과" } /// 마지막 파라미터가 람다일 경우, 중괄호를 소괄호 밖으로 뺄 수 있다.
                                                          /// 또, 타입 추론이 가능하므로 : Fruit는 생략 가능하다.
    filterFruits(fruits) { it.name == "사과" } /// 익명 함수의 파라미터가 한 개라면, a -> a 형태를 it으로 줄일 수도 있다.
    filterFruits(fruits) { fruit ->
        println("사과만 받는다.")
        fruit.name == "사과"  /// 람다를 여러 줄 작성할 경우 마지막 줄이 return값이 된다.
    }
    /**
     * Tip
     * it 키워드보다는 a -> a 형태를 더 추천한다.
     * 화살표 문법을 사용하면 함수의 내용이 it 키워드보다 더 명확해지기 때문.
     */

}

fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean,  /// 함수 자체를 파라미터로 넘길 수 있기 때문에, Predicate 대신 함수 타입을 넣어준다.
): List<Fruit> {

    val results = mutableListOf<Fruit>()
    for (fruit in fruits) { /// JDK 8처럼 선언식(stream)으로 변경 가능하다.
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}
