package com.lannstark.lec03

/**
 * 4. String interpolation / String indexing
 * - 문자열 타입을 코틀린에서 사용하는 법
 */

fun main() {

    /***
     * ${변수} 형식으로 문자열 내에 바로 사용 가능하다.
     */
    val person = Person("좋은 개발자", 100)
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세입니다."

    val name = person.name
    val age = person.age
    val log2 = "사람의 이름은 $name 이고 나이는 $age 세입니다." /// 변수의 경우 변수명만 사용하고 중괄호는 생략 가능
    /**
     * Tip!
     * 중괄호 생략이 가능하긴 하지만, 그럼에도 사용하는 것이
     * 1) 가독성
     * 2) 일괄 변환
     * 3) 정규식 활용
     * 측면에서 용이하다.
     *
     * +) 강사님 보강 내용
     * 본 강의에서는 문자열과 변수를 연결할 때 ${ } 사용을 추천드렸는데요! 코틀린 공식 코딩 컨벤션에서는
     *
     * /// Don't use curly braces when inserting a simple variable into a string template. Use curly braces only for longer expressions
     * 라고 이야기하고 있습니다!
     * 따라서, 간단한 변수를 쓰실 때는 $만 사용하는 것도 좋을 것 같아요!! (저도 최근에는 간단한 변수에 $만 사용하게 되더라고요!  😊 감사합니다!!)
     */


    /**
     * 여러 줄 입력 시에는 큰따옴표 세 개를 사용한다.
     * (이건 자바도 지원함!)
     */
    val multiline = """
        1
        2
        3
        4
        5
        ${name}
        ${age}
    """.trimIndent() /// Indentation을 삭제해줌


    /**
     * 문자열 내의 특정 문자 가져오기
     */
    val str = "ABCDE"
    val ch = str[1] /// 배열 인덱스 접근처럼 활용 가능

}
