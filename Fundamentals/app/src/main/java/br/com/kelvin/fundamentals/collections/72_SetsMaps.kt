package br.com.kelvin.fundamentals.collections

fun main(){

    // Set ignora os itens duplicados!
    // Tipo imutável
    val fruits = setOf("Orange", "Apple", "Grape", "Mango", "Apple")
    println(fruits)            // Printa 3, pois só é contado os itens únicos
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))

    val weekDay = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    println(weekDay)




}