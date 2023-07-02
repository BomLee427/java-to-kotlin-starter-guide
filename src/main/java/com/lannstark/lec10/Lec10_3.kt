package com.lannstark.lec10

/**
 * 3. 클래스를 상속받을 때 주의할 점
 */
fun main() {
    /**
     * 자식 클래스를 인스턴스화한 값
     * Base
     * 0
     * Derived Class
     */
    Derived(300)
}

/**
 * 상위 클래스를 설계할 때,
 * 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
 * = 상속받을 수 있도록 해서는 안 된다.
 */
open class Base(    /// 추상 멤버가 아닐 경우 open 키워드를 붙여야만 상속이 가능해진다.
    open val number: Int = 100  /// 역시 open
) {
    init {
        println("Base")
        println(number)     /// Accessing non-final property number in constructor
                            /// = 상위 클래스의 생성자와 init 블럭에서는 final이 아닌 하위 클래스의 field에 접근하면 안 된다.
        /**
         * 위 코드는 상위 클래스의 생성자가 호출되는 동안 하위 클래스의 프로퍼티를 호출하게 됨.
         * 하위 클래스는 아직 생성자가 실행되지 않았기 때문에 하위 클래스의 프로퍼티에는 값이 들어가지 않았다.
         * 그래서 0이 출력된 것.
         */
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}