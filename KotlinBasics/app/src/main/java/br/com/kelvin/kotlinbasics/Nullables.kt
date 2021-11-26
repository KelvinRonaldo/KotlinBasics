package br.com.kelvin.kotlinbasics

fun main() {
//    var name: String = "Kelvin"
//     name = null -> Compilation ERROR

    var nullableName: String? = "Ronaldo"
//    nullableName = null

//    var len = name.length

    var len2 = nullableName?.length
//     OR
//    if(nullableName != null) {
//        var len2 = nullableName.length
//    }else {
//        null
//    }
//    nullableName?.let { println(it.length) }

//  ?: Elvis Operator: Whether right is null, use left value
    var name = nullableName ?: "Silva"
    println("name is $name")

//  !! Not Null Assertion: Convert a nullable type to a not null type
    println(nullableName!!.lowercase())

//    Save operator works in chain
//    val wifesAge: String? = user?.wife?.age ?: 0

}