package br.com.kelvin.myfirstapp


// Os membros de uma classe abstrata não são abstratos padrão. Devem ser definidos
// como 'abstract' explicitamente.
// Só é possível implementas 1 classe abstrata por classe.
// Classes abstratas possuem construtores
abstract class Mammal(val name: String, val origin: String, val weight: Double, val maxSpeed: Double){

    val test: Int = 2 // Classe abstratas podem ter suas propriedades inicializadas
    abstract fun run()
    abstract fun breath()

    fun displayDetails(){
        println("$name is from $origin. It weighs $weight and can run at ${maxSpeed}KM/h")
    }
}

class Human(name: String, origin: String, weight: Double, maxSpeed: Double)
    : Mammal(name, origin, weight, maxSpeed){

    override fun run() = println("$name is running in two legs")
    override fun breath() = println("$name is breathing through your nose or your mouth")

}


class Elephant(name: String, origin: String, weight: Double, maxSpeed: Double)
    : Mammal(name, origin, weight, maxSpeed){
    override fun run() = println("$name is running in four legs")

    override fun breath() = println("$name is breathing through your trunk")

}

fun main(){
    val kelvin = Human("Kelvin", "Brazil", 65.0, 23.0)
    val george = Elephant("George", "South Africa", 6820.0, 25.0)

    // Não se pode instânciar um objeto de uma classe abstrata ou interface
    // val mammal = Mammal("Ronaldo", "Brazil", 85.0, 25.0)

    kelvin.displayDetails()
    george.displayDetails()
    kelvin.breath()
    george.breath()
    kelvin.run()
    george.run()

}