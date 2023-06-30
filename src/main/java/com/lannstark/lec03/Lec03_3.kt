package com.lannstark.lec03

/**
 * 3. Kotlin의 3가지 특이한 타입
 */

/**
 * Any
 * - Java의 Object 역할(모든 객체의 최상위 타입)
 * - Java와는 달리 모든 원시 타입에도 최상위 타입
 * - null을 포함할 수 없다. 포함하고 싶다면 Any?를 사용
 * - equals / hashCode / toString 포함
 */

/**
 * Unit
 * - Java의 void와 동일한 역할
 * - void와 다르게 Unit은 그 자체로 타입 인자로 사용할 수 있다.
 * - 함수형 프로그래밍에서 Unit은, 단 하나의 인스턴스만 갖는 타입을 의미한다.
 *   즉 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현한다.
 */

/**
 * Nothing
 * - 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 함수
 * - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
 */