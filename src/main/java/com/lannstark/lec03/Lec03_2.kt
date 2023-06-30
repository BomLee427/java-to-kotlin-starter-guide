package com.lannstark.lec03


/**
 * 2. 타입 캐스팅
 */
fun main() {

    /**
     * is 연산자
     */
    /// value is Type:
    //  value가 Type이면 true, 아니면 false
    //  value !is Type:
    //  value가 Type이면 false, 아니면 true
    val person = Person("개발자", 100)
    val value1 = person is Person /// true
    val value2 = person !is Person /// false

    /**
     * as 연산자
     */
    /// value as Type:
    // value가 Type이면 Type으로 형변환
    // value가 Type이 아니면 예외 발생

    /// value as? Type:
    //  value가 Type이면 Type으로 형변환
    //  value가 Type이 아니면 null
    //  value가 null이면 null(즉, null 체크 역시 동시에 가능)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { /// is = instanceOf. !is = 부정형
        // val person = obj as Person /// as = (Type). 생략 가능
        println(obj.age)
    }
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
