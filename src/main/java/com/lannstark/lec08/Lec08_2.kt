package com.lannstark.lec08

/**
 * 2. default parameter
 */
fun main() {
    repeat("Hello World", 3, true) /// OK
    repeat("Hello World") /// OK
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}
