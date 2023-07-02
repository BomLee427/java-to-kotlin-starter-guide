package com.lannstark.lec16

/**
 * 4. 지역함수
 */

/**
 * 함수 안에 함수를 선언할 수 있다.
 * - 함수로 추출하면 좋을 것 같은데, 이 함수를 지금 함수 내에서만 사용하고 싶을 때 사용한다.
 * - depth가 깊어지기도 하고, 코드가 깔끔하지는 않다.
 */
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) { /// 함수 내의 함수 선언
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. : ${name}")
            /// 이 경우, 실제로는 Person 내에서 validation 로직을 갖고 있는 게 더 낫다.
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    return Person(firstName, lastName, 1)
}
