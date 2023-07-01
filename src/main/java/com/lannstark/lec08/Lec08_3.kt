package com.lannstark.lec08

/**
 * 3. named argument(parameter)
 */

fun main() {

    /**
     * 매개변수 이름을 통해 직접 어떤 매개변수인지 지정할 수 있다.
     * 그렇지 않은 매개변수는 기본값을 사용한다.
     */
    repeat("Hello World", useNewLine = false)

    /**
     * builder를 만들지 않고 builder의 장점을 갖게 된다.
     */
    printNameAndGender(gender = "FEMALE", name = "개발자")

    /**
     * 코틀린에서 Java 함수를 가져다 쓸 때는 named argument를 사용할 수 없다.
     */
    // Lec08Main.repeat(str = "A") /// Not OK. Java 코드를 바이트코드로 변환할 때 parameter 이름을 보존하지 않기 때문.
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}
