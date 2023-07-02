package com.lannstark.lec11

/**
 * 3. 다양한 구성요소의 접근 제어
 */

/**
 * 클래스 멤버
 * - 코틀린의 기본 가시성 범위 제어와 동일
 */

/**
 * 생성자
 * - 범위는 동일
 * - 단, 생성자에 접근 지시어를 붙이려면 constructor를 써야 한다.
 */
class Cat private constructor () /// constructor 키워드 필요

/**
 * Tip
 * - Java에서, 유틸 함수를 작성할 때 추상클래스를 만들고 private 생성자를 만들어 인스턴스화를 막는 방법이 있었다.
 * - Kotlin에서도 비슷한 방법으로 가능은 하다.
 * - 하지만, 파일 최상단에 유틸 함수를 작성하는 것이 훨씬 더 편리하다.
 * - 자바에서 코틀린 코드를 사용할 때도 정적 메소드가 있는 것처럼 사용할 수 있다.
 */
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")   /// 자바 코드로 변환하면 static 클래스가 생긴다.
}

/**
 * 프로퍼티
 * - 범위는 동일, 그러나 두 가지 방법이 있다.
 * - var/val 앞에 접근 지시어를 붙이는 방법
 * - custom getter나 setter에만 접근 지시어를 붙여 서로 다른 가시성을 설정할 수 있다.
 */

/**
 * 세 개의 getter, 세 개의 setter가 있는 클래스
 */
class Car2(
    internal val name: String,
    private var owner: String,
    _price: Int /// parameter
) {
    var price = _price  /// public
        private set
}