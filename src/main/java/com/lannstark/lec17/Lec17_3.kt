package com.lannstark.lec17

import java.io.BufferedReader
import java.io.FileReader

/**
 * 3. try-with-resources
 */

/**
 * use
 * - Closeable 구현체 T에 대한 확장함수이다.
 * - inline 함수이다.
 * - (T) -> R 타입의 람다를 파라미터로 받는다.
 * - R을 리턴한다.
 */
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
    }
}
