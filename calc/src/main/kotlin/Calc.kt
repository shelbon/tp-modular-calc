package org.example

class Calc {
    fun process(values: List<Int>, operation: Operation): String {
        var output ="";
        var result = 0;
        for (i in  values.indices) {
            result=valueFromOperator(operation, values[i], result)
            if(i==0) {
                output = "${values[i].toString()}\n"
            }
            else{
                output += "${operation.value}${values[i]} (=${result})\n"
            }
        }
        output += "--------\n"
        output += "total = ${result}"
        return output
    }
    fun valueFromOperator(operation: Operation,currentValue:Int,value:Int): Int {
        return when(operation.value) {
            "+" -> currentValue + value
            "-" -> currentValue - value
            "*" -> currentValue  * value
            "/" -> currentValue /  value
            else -> throw IllegalArgumentException()
        }
    }
}
