package br.com.kelvin.myfirstapp


// *** Toda classe em Kotlin herda da classe Any ***
// class = Final por padrão. Não pode ser herdada
// open = Herança permitida.
// sealed = "Lacra" a classe. Também não pode ser herdada.

/*
// Uma classe que será herdada DEVE ser 'open'
// pois em Kotlin, todas as classe são 'final',
// não podem ser herdadas por padrão.
open class Vehicle {            // Super Classe || Parent Class || Base Class
    // propriedades
    // métodos
}

// Car herda Vehicle
open class Car: Vehicle() {    // Sub Class || Derived Class de Vehicle

}

class EletricCar: Car(){        // Sub Class || Derived Class de Car

}
*/

// **** 64. INTERFACES
// Interface são como "contratos" que as classe pode assinar.
// Se "assinarem" são obrigadas a implementas suas propriedades
// e funções.
// É possível implementar várias interfaces na mesma classe
// Interfaces NÃO possuem construtores; Não mantém valores na suas
// propriedades
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}
// **** 64. INTERFACES

open class CarB(val name: String, val brand: String, override val maxSpeed: Double) : Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount >= 0)
            this.range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance kilometers")
    }

// **** 64. INTERFACES
    override fun drive(): String = "driving the interface drive"
//    OU
//    override fun drive(): String {
//        return "driving the interface drive"
//    }
// **** 64. INTERFACES
}

class EletricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : CarB(name, brand, maxSpeed){

    var chargerType = "Type1"

    // Sobrepondo propriedades e métodos da classe pai na subclasse
    override var range = batteryLife * 5
    override fun drive(distance: Double) {
        println("Drove for $distance KM on eletricity")
    }

    override fun drive(): String {
        return  "Drove for $range KM on eletricity"
    }

    override fun brake() {
        // super.[...] - Executa o método da classe pai.
        super.brake()
        println("brake inside eletric car")
    }
}

fun main(){
    var audiA3 = CarB("A3", "Audi", 200.0)
    var teslaS = EletricCar("S-Model", "Tesla", 85.0, 254.0)


    // O métodos que "não existem" na classe EletricCar e são chamados
    // não geram erro, pois são herdados da classe Pai, no caso CarB
    teslaS.extendRange(200.0)

    // Polimorfismo
    // Objetos de classes diferentes com características iguais
    audiA3.drive(620.0)
    teslaS.drive(562.0)

    teslaS.drive()
    teslaS.chargerType = "Type2"

    teslaS.brake()
    audiA3.brake()
}