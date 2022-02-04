package br.com.kelvin.myfirstapp

class KotlinBasics {
}


fun main(){
    var kelvin = Person("Kelvin", "Ferreira", 22) // Declarando um objeto de uma classe

    kelvin.hobby = "talk"
    kelvin.age = 25
    println("Kelvin is ${kelvin.age} yo")
    kelvin.stateHobby()

    var ana = Person()
    ana.hobby = "caress cats"
    ana.stateHobby();

    var anaMota = Person(lastName = "Mota")

//    var a72 = MobilePhone("Android", "Samsung", "Galaxy A72")
//    var s21Ultra = MobilePhone("Android", "Samsung", "Galaxy S21 Ultra")
//    var iphone13 = MobilePhone("iOS", "Apple", "iPhone 13")
}

// Criando a classe junto com seu construtor primário
// class Person constructor(firstName: String, lastName: String)
// OU
class Person (firstName: String = "Ana", lastName: String = "Volpato"){ // Parâmetros com valores padrão

    // Variáveis membros da classe: Propriedadores
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var name: String = ""


    // Método do kotlin chamado assim que um objeto da classe é instanciado
    init {
        this.name = "$firstName $lastName"
        println("Person Created: $firstName $lastName")
    }

    // Método Construtor (construtor secundário)
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
        this.age = age
        println("Person Created: $firstName $lastName ($age)")

    }

    // Funções membro da classe: Métodos
    fun stateHobby(){
        println("$name\'s hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("Phone created:\n" +
                "osName = $osName\n" +
                "brand = $brand\n" +
                "model = $model\n")
    }
}