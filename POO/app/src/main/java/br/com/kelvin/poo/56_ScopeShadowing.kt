package br.com.kelvin.myfirstapp

var b = 5 // Essa varíval é acessível tanto em main() quanto am myFunction(), piois pertence ao escopo do arquivo.
fun main(){
    myFunction(56)
//    b = 5 // Não é possível acessar a variável b criada em myFunction() pois ela pertence apenas ao escopo desta função
//    var b = 5 // Essa é a variável b da função main(), acessível apenas nesta função
}

// Esse a é um parâmetro
fun myFunction(a: Int){
    // a = 5 // Não é possível fazer uma atribuição a um parâmetro de função

    // a é uma variável
    var a = 4
    println("a: $a") // Será printada apenas a variável local (shadowing)
//    var b = a // Essa é a variável b da função myFunction(), acessível apenas nesta função
//    println("b: $b")
}