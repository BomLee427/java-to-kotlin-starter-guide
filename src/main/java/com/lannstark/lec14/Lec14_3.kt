package com.lannstark.lec14

/**
 * 3. Sealed Class, Sealed Interface
 */

/**
 * 상속이 가능하도록 추상클래스를 만들고 싶은데, 외부에서는 이 클래스를 상속받지 않았으면 좋겠다.
 * -> 하위 클래스를 막자.
 */

/**
 * Sealed ~~:
 * - 컴파일 때 하위 클래스의 타입을 모두 기억한다. 즉, 런타임 시 클래스 타입이 추가될 수 없다.
 * - 하위 클래스와 같은 패키지에 있어야 한다.
 * - 클래스를 상속받을 수 있고, 하위 클래스는 멀티 인스턴스가 가능하다는 점에서 Enum과 다르다.
 */

/**
 * 실제로 추상화가 필요한 Entity or Dto에 sealed class를 활용한다.
 * JDK 17에도 추가되었다.
 */
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그랜저", 3_000L)

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Grandeur -> TODO()
        /// Enum과 마찬가지로 else를 작성하지 않아도 되고, 새 구현체가 추가되면 IDE가 감지한다.
    }
}
