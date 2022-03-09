package br.com.kelvin.fundamentals.collections

fun main(){

    // val numbers: IntArray = intArrayOf(1, 5, 9, 7, 3, 4)
    // OU
    // val numbers = intArrayOf(1, 5, 9, 7, 3, 4)   // type inference
    // OU
    val numbers = arrayOf(1, 5, 9, 7, 3, 4)   // type inference

    println("int Valores iniciais: ${numbers.contentToString()}")
    numbers[0] = 658
    numbers[2] = 20
    numbers[4] = 7
    // numbers[7] = 6  // Exception: Tentando acessar um índice que não existe no array
    println("int Valores finais: ${numbers.contentToString()}")

    val numbersD: DoubleArray = doubleArrayOf(5.0, 9.8, 4.2, 35.4, .87)
    println("double Valores finais: ${numbersD.contentToString()}")
    numbersD[0] = 75.7
    numbersD[2] = .51
    numbersD[4] = 3.9
    println("double Valores finais: ${numbers.contentToString()}")

    val weekDays = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    println(weekDays.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.9), Fruit("Grape", 1.9))
    println(fruits.contentToString())
    for(fruit in fruits)
        println(fruit.name)

    for(index in fruits.indices)
        println("${fruits[index].name} is in index $index")

    val mix = arrayOf("Sun", "Mon", "Tue", 12.8, 5, 7, Fruit("Mango", 4.2))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)