package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * 2. Checked Exception과 Unchecked Exception
 */

/**
 * 프로젝트 내 파일의 내용물을 읽어오는 예제
 */
fun readFile() { /// checked exception임에도 throws를 명시하지 않음
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}
/// 코틀린에서는 모두 Unchecked Exception!
