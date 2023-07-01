package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

/**
 * 3. try with resources
 */

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { /// inline 확장 함수 use
        reader -> println(reader.readLine())
    }
}
/// try with resources가 사라지고 use를 사용
