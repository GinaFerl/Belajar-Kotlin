package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = Regex("""\d+""")
    val matchResult = regex.find(str)

    return if (matchResult != null) {
        val findNumber = matchResult.value.toInt()
        val multipleNumber = findNumber * int

        str.replaceFirst(matchResult.value, multipleNumber.toString())
    } else {
        "$str$int"
    }
}
