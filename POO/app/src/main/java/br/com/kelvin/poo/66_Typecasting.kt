package br.com.kelvin.myfirstapp

import kotlin.math.floor

fun main(){
    val stringList: List<String> = listOf("Kelvin", "Ste", "Marcelo", "Ana")
    val mixedTypeList: List<Any> = listOf("Ronaldo", 22, 9.9, "Olá")

    for(value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown type!")
        }
    }

    // Smart cast
    val obj1: Any = "Fala fiote! Ta bom?"
    if(obj1 !is String)
        println("Not a string")
    else
        // o cast de obj1 para string é feito automaticamente
        println("Found a string of length ${obj1.length}")

    // Casting explícito usando 'as' (não é seguro) - pode dar ruim
    val str1: String = obj1 as String
    println(str1.length)

    // Erro que pode ser causado...
    // val obj2: Any = 1355
    // val str2: String = obj2 as String
    // println(str2.length)    // Vai dar exception pois obj2 não é do tipo string e não pode ser usado como tal

    // Casting explícito usando 'as?' (seguro)
    val obj3: Any = 686
    val str3: String? = obj3 as? String
    println(str3) // Printa 'null'
}