package br.com.kelvin.fundamentals.collections

fun main(){
    // Tipo imutável, não é possivel adicionar itens após a incialização
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")

    // println(anyTypes.size)
    // println(months[1])

    for(month in months)
        println(month)

    // Cria agora um tipo de lista que é mutável
    val addMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")

    addMonths.addAll(newMonths)     // Adiciona todos os valores de um array/lista
    addMonths.add("July")           // Adiciona um item
    println(addMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed", "Thu", "Fri")
    days.add("Sat")
    days[2] = "Sun"             // Atribui à uma posição da lista
    days.removeAt(0)            // Remove uma posição da lista
    val removeList = mutableListOf<String>("Tue", "Fri")
    days.removeAll(removeList)
    println(days)
}