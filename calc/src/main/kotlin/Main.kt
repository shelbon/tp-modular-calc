package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val csv="1\n" +
            "2\n" +
            "3"
    val values = csv.split("\n").map { it.toInt() }
    val operation = Operation.fromString(args[1])
    val calc= Calc()
    println(calc.process(values, operation))
}
