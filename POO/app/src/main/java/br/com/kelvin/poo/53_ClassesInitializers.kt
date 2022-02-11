package br.com.kelvin.myfirstapp

fun main(){
    var kelvin = Person("Kelvin", "Ferreira") // Declarando um objeto de uma classe
    var ana = Person()
    var anaMota = Person(lastName = "Mota")

    /* **** EXERCISE **** */
    var a72 = MobilePhone("Android", "Samsung", "Galaxy A72")
    var s21Ultra = MobilePhone("Android", "Samsung", "Galaxy S21 Ultra")
    var iphone13 = MobilePhone("iOS", "Apple", "iPhone 13")
    /* **** EXERCISE **** */
}

// Criando a classe junto com seu construtor primário
// class Person constructor(firstName: String, lastName: String)
// OU
class Person (firstName: String = "Ana", lastName: String = "Volpato") { // Parâmetros com valores padrão

    // Método do kotlin chamado assim que um objeto da classe é instanciado
    init {
        println("Person Created: $firstName $lastName")
    }
}

/* **** EXERCISE **** */
class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("Phone created:\n" +
                "osName = $osName\n" +
                "brand = $brand\n" +
                "model = $model\n")
    }

    /* *** Exercise 61 *** */
    private var battery: Int = 48

    fun chargeBattery(battery: Int){
        println("It had: ${this.battery}")
        this.battery = if(this.battery + battery > 100) 100 else this.battery + battery
        println("Now: ${this.battery}")
    }
    /* *** Exercise 61 *** */
}
/* **** EXERCISE **** */