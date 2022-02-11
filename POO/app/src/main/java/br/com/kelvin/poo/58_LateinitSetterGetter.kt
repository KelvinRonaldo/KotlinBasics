package br.com.kelvin.myfirstapp

import java.util.*

fun main(){
    var myCar = Car()
    myCar.maxSpeed = 952    // set() maxSpeed
//    myCar.myModel = "M3"
    println("brand is: ${myCar.myBrand}")
    println("max speed is: ${myCar.maxSpeed}") // get() maxSpeed
    println("model is: ${myCar.myModel}") // get() maxSpeed
}
class Car {
    // lateinit: Define que a varíavel será inicializada depois, não na declaração
    lateinit var owner: String

    var maxSpeed: Int = 250
    /* Isso é o que o Kotlin já faz automaticamente
    get() = field
    set(value) {
        field = value
    }
    */
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("Max Speed cannot be less than 1")
    }

    val myBrand: String = "bmW"
        // Custom getter
        get() = field.uppercase()


    var myModel: String = "M5"
    // torna o método set() dessa propriedade privado
    private set

    init {
        this.myModel = "M8"
        this.owner = "Kelvin"
    }


}