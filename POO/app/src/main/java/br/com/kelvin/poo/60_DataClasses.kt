package br.com.kelvin.myfirstapp

// Em um 'data class', o construtor primário deve ter
// pelo menos 1 parâmetro
data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Kelvin")

    val userName = user1.name
    println("name: $userName")
    user1.name = "Ana"
    val user2 = User(1, "Ana")

    println(user1 == (user2))


    val updatedUser = user1.copy(name = "Claudia")
    println("User1 details: $user1")
    println("UserIp details: $updatedUser")
    println(updatedUser.component1()) // vai printar 1
    println(updatedUser.component2()) // vai printar "Claudia"

    // Desestructuring
    val (id, name) = updatedUser

    println("id: $id\nname: $name")

    /* *** Exercise 61 *** */
    var redmi11 = MobilePhone("Android", "Xiaomi", "Redmi 11")
    redmi11.chargeBattery(30)
    /* *** Exercise 61 *** */
}
