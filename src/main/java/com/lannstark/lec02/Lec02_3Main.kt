package com.lannstark.lec02

/**
 * 3. null이 아님을 단언 - !!
 * nullable 타입이지만, 아무리 생각해도 null이 될 수 없는 경우
 */
fun startsWithA5(str: String?): Boolean {
    return str!!.startsWith("A")
    /// 변수 뒤에 !!를 넣으면 컴파일러가 오류 체크를 하지 않음.
//      단, RunTime 예외가 발생할 수 있으므로 정말 확실한 경우에만 사용할 것
}

