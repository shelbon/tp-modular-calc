package org.example

fun main(args = arrayOf()) {
       val csv="1\n" +
               "2\n" +
               "3"
       val values = csv.split("\n").map { it.toInt() }
       val operation = Operation.fromString(args[1])
       println(values)
}
