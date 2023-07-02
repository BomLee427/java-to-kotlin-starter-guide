package com.lannstark.lec15

/**
 * 2-1. 코틀린에서의 Collection: List
 */

/**
 * 컬렉션을 만들 때도 불변/가변 여부에 따라 val과 var을 선언해야 함
 * 그러나 val을 설정하더라도 컬렉션의 요소는 변경할 수 있기 때문에, MutableXXX등의 이름으로 불변 컬렉션 인터페이스가 존재한다.
 * 불변 컬렉션이더라도, Refernce 타입 컬렉션일 때 element 내의 필드는 바뀔 수 있다.
 */

fun main() {

    /**
     * List: 순서가 있고 중복을 허용함. 기본 구현체는 ArrayList.
     */
    val numbers = listOf(100, 200) /// 불변 리스트(요소 추가 삭제 불가)
    val mutableNumbers = mutableListOf(100, 200) /// 가변 리스트(요소 추가 삭제 가능)
    val emptyList = emptyList<Int>() /// 타입 추론이 불가하기 때문에 타입을 적어야 함
    printNumbers(emptyList()) /// 타입 추론이 가능한 경우 emptyList도 타입 생략이 가능하다.

    /**
     * List와 반복문의 활용
     */
    numbers[0] /// 배열처럼 대괄호로 가져올 수 있다.

    for (number in numbers) { /// for-each 문
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) { /// 전통적인 for문 느낌
        println("${idx}, ${value}")
    }

    /**
     * List 요소 추가
     */
    mutableNumbers.add(300) /// 자바의 List에서 사용할 수 있는 기능 대부분 사용 가능

}

/**
 * Tip!
 * 변수 선언과 같이, 불변 리스트를 우선 만들고 필요한 경우에만 가변 리스트로 바꾸자.
 */

private fun printNumbers(numbers: List<Int>) {}
