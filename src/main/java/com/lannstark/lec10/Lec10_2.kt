package com.lannstark.lec10

/**
 * 2. 인터페이스
 */

/**
 * 인터페이스는 인스턴스화할 수 없다.
 */
interface Flyable {

    fun act() { /// default 키워드 없이 메서드 구현이 가능하다.
        println("파닥 파닥")
    }

    fun fly()   /// 추상 메서드를 만들 수 있다.

    val flyAbility: Int /// 프로퍼티란 getter, setter 등의 메서드도 포함하기 때문에 인터페이스에 정의 가능
    //  get() = 3 /// 직접 default 값을 넣어줄 수도 있다.

}


interface Swimmable {

    fun act() {
        println("어푸 어푸")
    }

    fun swim()
}


class Penguin2(
    species: String
) : Animal(
    species, 2
), Swimmable, Flyable
{
    private val wingCount: Int = 2

    override fun move() {
        println("뒤뚱뒤뚱")
    }

    override val legCount: Int
        get() = super.legCount + wingCount

    override fun act() {
        super<Swimmable>.act()  /// 타입 충돌 시 Java와 달리 <> 안에 타입 명시
        super<Flyable>.act()
    }

    /// Backing field가 없는 프로퍼티를 Interface에 만들 수 있다.
    override val flyAbility: Int
        get() = 99


    override fun swim() {

    }

    override fun fly() {

    }
}