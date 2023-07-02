package com.lannstark.lec12

/**
 * 코틀린에서 object 키워드를 다루는 방법
 * 1. static 함수와 변수
 */

/**
 * 코틀린은 static이 없다.
 *
 * companian object: 클래스와 동반하는 오브젝트
 * 자바의 static 키워드처럼 각 인스턴스가 개별 값을 갖지 않고 정적으로 같은 값을 공유한다는 의미
 * 하나의 객체로 간주되며, 이름을 붙이거나 interface를 구현할 수도 있다.
 *
 * companion object에 유틸성 함수를 넣을 수도 있지만, 그래도 파일 최상단에 선언하는 것을 추천한다.
 */
class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log  {  /// static이라는 키워드가 없고, 대신 companion object 블럭 안에 선언한다.
        /**
         * const:
         * 그냥 val은 런타임 시 값이 할당되나, const를 붙이면 컴파일시에 값이 할당된다.
         * "진짜" 상수에 붙이게 된다.
         * 기본 타입과 String에만 붙일 수 있다.
         */
        private const val MIN_AGE = 1   /// const 키워드

        @JvmStatic  /// Java에서 일반 static 메서드처럼 사용하고 싶다면 붙이자.
        fun newBaby(name: String): Person = Person(name, MIN_AGE)

        override fun log() {    /// 복습! override는 키워드로 선언해야 한다.
            println("This is companion object")
        }

    }
}
