package com.lannstark.lec09

/**
 * 3. 커스텀 getter, setter
 */

class Person3(
    name: String = "이보미", /// val이라는 키워드를 쓰면 프로퍼티로 만들어준다.
    val age: Int = 1 /// default parameter를 사용했다.
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    /**
     * 성인인지 확인하는 예제
     */
    fun isAdult(): Boolean = age >= 20 /// 기존 Java 코드처럼 메서드를 만들어줄 수도 있다.

    /*
    val isAdult: Boolean/// custom getter(). 마치 isAdult에 대한 프로퍼티가 있는 것처럼 보여주는 방법
        get() {
            return age >= 20 /// 복습! 함수의 바디가 값 하나일 경우 중괄호와 return을 생략하고 =로 쓸 수 있다.
        }
    */
}

/**
 * Custom getter VS Funtion
 * 강사님 의견
 * - 객체의 속성이라면 custom getter를 사용
 * - 그렇지 않다면 함수를 사용
 */
