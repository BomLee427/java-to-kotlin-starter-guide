package com.lannstark.lec14

/**
 * 2. Enum class
 */

/**
 * Enum class
 * - 다른 클래스를 상속받을 수 없다.
 * - 인터페이스는 구현 가능하다.
 * - 각 코드가 싱글톤이다.
 */
enum class Country(
    private val code: String
) {
    KOREA("KO"), AMERICA("US")
}


/**
 * when expression은 Enum 혹은 sealed 클래스와 함께 사용할 때 더욱 진가를 발휘한다.
 */
fun handleCountry(country: Country) {
    when (country) {    /// Enum을 인자로 받음
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        /// Enum 중 누락시킨 속성이 있다면 컴파일러가 알려준다.
        /// 컴파일 시점에 Enum의 모든 코드를 알고 있으므로 else가 필요없다.
    }
}
