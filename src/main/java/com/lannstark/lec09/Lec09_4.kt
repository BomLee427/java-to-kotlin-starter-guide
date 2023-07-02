package com.lannstark.lec09

/**
 * 4. backing field
 */

class Person4(
    name: String
) {

    /**
     * 자기 자신의 속성을 바꾸어주는 custom getter 예제
     */
    val name = name
        get() = field.uppercase() /// field: .name이 get()을 호출하고, get()은 다시 .name을 호출함. 무한루프 발생.
                                /// 이를 막기 위한 예약어가 field이다. 자기 자신을 가리킴.

    /**
     * Tip
     * 실제로 custom getter에서 field를 쓰는 경우는 드물었다.
     * 아래와 같은 식으로도 구현할 수 있기 때문이다. (혹은 함수)
     */
    val upperCaseName: String
        get() = this.name.uppercase()


    /**
     * name을 set할 때 무조건 대문자로 작성하는 예제
     */
    var name2 = name
        set(value) { /// custom setter
            field = value.uppercase() /// backing field
        }
    /**
     * 그러나 setter의 사용 자체도 지양하는 편이기 때문에 이 예제와 같은 경우도 잘 쓰지 않는다.
     */
}