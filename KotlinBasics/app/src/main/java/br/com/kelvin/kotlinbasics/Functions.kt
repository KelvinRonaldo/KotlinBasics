package br.com.kelvin.kotlinbasics

/** fun funName(parameters...) : ReturnType{} **/
fun main(){
    // Here, a and b are arguments
    var iResult = addUp(5, 3)
    println("The sum is $iResult")
    var dResult = average(98.54, 65.06)
    println("The average is $dResult")
}

// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // return (output)
    return a + b
}

fun average(a: Double, b: Double) : Double{
    return (a + b) / 2
}

fun myFunction(){
    println("Called from myFunction")
}