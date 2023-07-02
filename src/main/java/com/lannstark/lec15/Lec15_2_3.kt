package com.lannstark.lec15

/**
 * 2-3. 코틀린에서의 Collection: Map
 */

fun main() {
    /**
     * Map: Key와 Value로 되어 있고 순서가 없으며, Key는 중복을 허용하지 않으며 Value는 중복을 허용한다.
     */
    val oldMap = mutableMapOf<Int, String>() /// 가변 맵 초기화. 타입 추론이 불가능하므로 타입을 넣어준다.
    oldMap.put(1, "MONDAY") /// 전통적 방식으로 값을 넣거나
    oldMap[2] = "TUESDAY" /// 대괄호를 사용해 키에 접근할 수 있다.

    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY") /// 불변 맵을 값과 함께 초기화
    /// 여기서 to는 중위호출함수 (복습! 반복문에서 배웠던 downTo나 step과 같음)
    /// to는 키와 밸류로 Pair 객체를 만들어주며, mapOf는 사실 Pair객체를 받게 되는 것.

    /**
     * Map과 반복문의 활용
     */
    for (key in oldMap.keys) { /// keys: Map 인터페이스에 정의된 필드
        println(key)
//        println(oldMap.get(key)) /// OK. But replaceable
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}
