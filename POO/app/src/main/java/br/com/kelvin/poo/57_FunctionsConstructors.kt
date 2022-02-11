package br.com.kelvin.myfirstapp

fun main(){
    var kelvin = PersonB("Kelvin", "Ferreira", 22) // Declarando um objeto de uma classe

    kelvin.hobby = "talk"
    kelvin.age = 25
    println("Kelvin is ${kelvin.age} yo")
    kelvin.stateHobby()

    var ana = PersonB()
    ana.hobby = "caress cats"
    ana.stateHobby();

    var anaMota = PersonB(lastName = "Mota")
}

// Criando a classe junto com seu construtor primário
// class PersonB constructor(firstName: String, lastName: String)
// OU
private class PersonB (firstName: String = "Ana", lastName: String = "Volpato"){ // Parâmetros com valores padrão

    // Variáveis membros da classe: Propriedades
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var name: String = ""


    // Método do kotlin chamado assim que um objeto da classe é instanciado
    init {
        this.name = "$firstName $lastName"
        println("PersonB Created: $firstName $lastName")
    }

    // Método Construtor (construtor secundário)
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
        this.age = age
        println("PersonB Created: $firstName $lastName ($age)")

    }

    // Funções membro da classe: Métodos
    fun stateHobby(){
        println("$name\'s hobby is $hobby")
    }
}