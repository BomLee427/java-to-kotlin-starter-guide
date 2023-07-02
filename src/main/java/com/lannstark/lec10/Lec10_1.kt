package com.lannstark.lec10

/**
 * 코틀린에서 상속을 다루는 방법
 * 1. 추상 클래스
 */


/**
 * 추상 클래스는 인스턴스화할 수 없다.
 */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int  /// 추상 프로퍼티가 아닌 프로퍼티를 override하려면 open 키워드가 필요하다.
) {
    abstract fun move()
}

/**
 * 상위 클래스를 상속받을 때, 상위 클래스의 생성자를 반드시 호출해야 한다.
 */
class Cat(species: String) : Animal(   /// Convention: 상속받을 때 쓰는 콜론은 한 칸 띄어야 함.
    species, 4   /// super() 호출을 위해 상속받는 부분에서 바로 괄호를 써줌.
) {
    override fun move() {   /// 어노테이션이 아닌 지시어를 사용.
        println("고양이는 걸어")
    }

}


class Penguin1(species: String) : Animal(species, 2) {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄은 뒤뚱뒤뚱")
    }

    override val legCount: Int
        get() = super.legCount + wingCount /// 상위 클래스에 접근하는 키워드는 super이다.

}