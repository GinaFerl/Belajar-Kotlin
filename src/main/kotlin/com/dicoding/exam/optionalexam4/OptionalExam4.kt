package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length

    val midIndex = length / 2

    return if (length % 2 == 0) {
        string.substring(midIndex - 1, midIndex + 1)
    } else {
        string[midIndex].toString()
    }
}