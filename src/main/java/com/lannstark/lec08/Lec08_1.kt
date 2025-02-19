package com.lannstark.lec08

/**
 * 코틀린에서 함수를 다루는 방법
 * 1. 함수 선언 문법
 */
fun main() {

}

/**
 * 두 정수를 받아 더 큰 정수를 반환하는 예제
 * - public은 생략 가능하다.
 * - fun은 함수를 선언하는 키워드이다.
 * - 매개변수는 변수명: 타입 과 같이 적는다.
 * - 리턴 타입은 : 타입 과 같이 적는다. 타입 추론이 가능한 경우, 그리고 Unit(void)은 생략 가능하다.
 * - 중괄호 안의 본문이 하나의 값이면 중괄호 블럭 대신 =으로 대체할 수 있다. (이 경우 return문은 필요없다.)
 * - 함수에 블럭을 사용하는 경우는 반환 타입이 Unit이 아닐 경우 명시적으로 작성해야 한다.
 * - 한 줄짜리 if문은 중괄호를 생략 가능하다.
 * - 함수는 클래스 안에도 있을 수 있고, 파일 최상단에도 있을 수 있다. 또 한 파일 안에 여러 함수가 있을 수 있다.
 */
fun max(a: Int, b: Int): Int = if (a > b) a else b
