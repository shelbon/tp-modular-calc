package org.example

class Operation (val value:String) {
    companion object {
        fun fromString(value: String): Operation {
            return when (value) {
                "+" -> Operation("+")
                "-" -> Operation("-")
                "*" -> Operation("*")
                "/" -> Operation("/")
                else -> throw IllegalArgumentException()
            }
        }

    }

}
