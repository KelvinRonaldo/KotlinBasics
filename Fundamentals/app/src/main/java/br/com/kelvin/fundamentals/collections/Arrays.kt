package br.com.kelvin.fundamentals.collections

fun main(){

    // val numbers: IntArray = intArrayOf(1, 5, 9, 7, 3, 4)
    // OU
    // val numbers = intArrayOf(1, 5, 9, 7, 3, 4)   // type inference
    // OU
    val numbers = arrayOf(1, 5, 9, 7, 3, 4)   // type inference

    println("Valores iniciais: ${numbers.contentToString()}")
    numbers[0] = 658
    numbers[2] = 20
    numbers[4] = 7
    println("Valores finais: ${numbers.contentToString()}")
}