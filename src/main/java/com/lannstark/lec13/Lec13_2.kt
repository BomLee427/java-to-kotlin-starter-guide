package com.lannstark.lec13

/**
 * 2. 코틀린의 중첩 클래스
 */

/**
 * 코틀린의 중첩 클래스는 기본적으로 외부에 대한 참조를 갖고 있지 않다.
 */
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(   /// static 없이 그냥 class 키워드를 사용하면 된다.
        private val area: Double
    )

    /**
     * 바깥 클래스에 대한 참조를 갖는 클래스를 선언하려면
     */
    inner class DiningRoom(   /// inner 키워드로 바깥 클래스를 참조한다.
        private val area: Double
    ) {
        val address: String
            get() = this@House.address  /// = House.this.address
    }
}
