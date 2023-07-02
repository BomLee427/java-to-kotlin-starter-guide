package com.lannstark.lec06

/**
 * 19강. Jump, Label
 */

/**
 * 코틀린의 제어문 정의
 * - return: 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다.
 * - break: 가장 가까운 루프가 제거된다.
 * - continue: 가장 가까운 루프를 다음 step으로 보낸다.
 */

/**
 * break, continue의 기능은 자바와 완전히 동일하다. 단!
 * 함수형 프로그래밍의 forEach를 쓸 때는 continue, break를 쓸 수 없다.
 *
 * 이 문제를 해결하기 위해 run{}+return@run(break), return@forEach(continue) 사용이 가능하다.
 * -> 강사님 의견: 하지만 익숙한 문법을 사용하는 것이 버그발생률을 낮추고 가독성을 높일 수 있기 때문에 굳이 사용할 필요는 없다.
 */

/**
 * Label: 특정 expression에 라벨이름@을 붙여 하나의 라벨로 간주하고
 * break, continue, return과 같은 제어문을 사용할 수 있는 기능
 * return@run은 run 블록을 가리키고, return@forEach는 가까운 forEach문을 가리키기 때문에 각각 제어문 역할을 수행할 수 있는 것이다.
 */

/**
 * Tip!
 * 그러나 Label을 사용한 Jump는 사용하지 않는 것을 추천한다.
 * 라벨을 사용해 코드의 흐름이 복잡해지게 되면 유지보수가 매우 힘들어지기 때문이다.
 */
