package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val sum = number.toString().map { it.toString().toInt() }

    val min = sum.minOrNull() ?: 0
    val max = sum.maxOrNull() ?: 0

    return min + max
}
