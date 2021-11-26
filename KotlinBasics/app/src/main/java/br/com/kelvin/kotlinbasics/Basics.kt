package br.com.kelvin.kotlinbasics

/**
 * @brief Principal função do Kotlin.
 * Ponto de partida da aplicação
 */
fun main(){
    // var = variables
    // val = constants

    // Variables need to be initializated
    // or have their type explicit declared.
    // type string
    var myName = "Kelvin"
    val myLastname = "Ferreira"
    //type int 32 bits
    var myAge = 12

    // myLastname = "Silva" // throw an error
    myName = "Ronaldo"

    // TODO: Add a new functionality
    print("Hello " + myName + " " + myLastname)

    // All of them are Interger types
    val myByte: Byte = 127                          // 8 bit
    val myShort: Short = 125                        // 16 bit
    val myInt: Int = 123_123_123                      // 32 bit
    val myLong: Long = 12_039_812_309_487_120_3     // 64 bit
    // In all number types we can use '_' to make it more readable

    // Floating Point number types
    // When a floating point(like 13.37) number, Kotlin
    // assumes that is a Double type. To assign a Float,
    // the suffix F has to be on the number.
    val myFloat: Float = 13.37F                     // 32 bit
    val myDouble: Double = 3.14159265358979323846   // 64 bit

    // Logical values: true or false
    var isSunny: Boolean = true
    isSunny = false

    // Character
    // Doesn't matter what it is, since it have only 1 element
    // Can be a letter, digit, symbol or anything else
    val explicitChar: Char = '@'
    val letterChar = "A"
    val digitChar = '1'

    // Strings
    val myStr = "Fala Fiote!"
    val firstCharAtStr = myStr[0]
    val latCharInStr = myStr[myStr.length - 1]
    print("\nfirstCharAtStr: " + firstCharAtStr)
    print("\nlatCharInStr: " + latCharInStr)

    // String template/String imterpolation.
    // Use $ to use variables inside strings.
    // Use ${...} to use/do statements/processes
    // inside strings
    print("\n$myStr Ta bom?")
    // print("\nFirst character $firstCharAtStr and the lenth of myStr is $myStr.length")
    print("\nFirst character $firstCharAtStr and the lenth of myStr is ${myStr.length}\n")

    // Atithmetic operators(+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resulDouble: Double
    resulDouble = a / b
    println(resulDouble)

    // Comparision operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 5
    println("isEqual is $isEqual")

    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")

    println("is-5Greater3 ${-5 > 3}")
    println("is5LowerEqual3 ${5 <= 3}")
    println("is5GreaterEqual3 ${5 >= 3}")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("Now, myNum is $myNum")

    // Increment & Decrement operators (++, --)
    myNum++
    println("And now, myNum is $myNum")
    println("So, myNum is ${myNum++}")
    println("Then, myNum is ${++myNum}")
    println("And myNum is ${--myNum}")

    var heightPerson1 = 189
    var heightPerson2 = 185

    if(heightPerson1 > heightPerson2)
        println("Use raw force")
    else if(heightPerson1 == heightPerson2)
        println("Use your power technique 1337")
    else
        println("Use technique")


    var myCurrentAge = 14

    if(myCurrentAge >= 21)
        println("Now you can drink in the US")
    else if(myCurrentAge >= 18)
        println("You may vote now")
    else if(myCurrentAge >= 16)
        println("You may drive now")
    else
        println("You're to young")

    var name = "Kelvin"

    if(name == "Kelvin")
        println("Welcome home $name!")
    else
        println("Who are you?")

    val isRainy = true
    if(isRainy)
        println("It's rainy")

    /*
    * In Kotlin you can use if statement as an expression, for example,
    * you can assign the result of if-else to a variable.
    */
    //create a variable for testing all condition
    val age = 25
    //create a variable for drinkingAge
    val drinkingAge = 21
    //create a variable for votingAge
    val votingAge = 18
    //create a variable for drivingAge
    val drivingAge = 16

    //Assign the if statement to a variable
    val currentAge =  if (age >= drinkingAge){
        println("Now you may drink in the US")
        //return the value for this block
        drinkingAge
    }else if(age >= votingAge){
        println("You may vote now")
        //return the value for this block
        votingAge
    }else if (age >= drivingAge){
        println("You may drive now")
        //return the value for this block
        drivingAge
    }else{
        println("You are too young")
        //return the value for this block
        age
    }
    //print the age for the passing condition
    print("Current age is $currentAge")

    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 4
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    myCurrentAge = 22
    when(myCurrentAge){
        in 0..15 -> println("You're to young")
        16, 17 -> println("You may drive now")
        in 18..20 -> println("You may vote now")
        !in 0..20 -> println("Now you can drink in the US")
    }

    // Any = The variable can be of any type of data
    /*
    var x: Any = "13.37F"
    when(x){
        is Int -> println("$x is a Int")
        !is Double -> println("$x isn't a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
    */

    /*
    Just like if-else, when can also be
    used as an expression by assigning
    it to a variable.
    */
    //assign when to a variable
    val whenAssignExample: Any = 13.37
    val ret =  when(whenAssignExample) {
        //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    println("$whenAssignExample $ret")

    // While loop
    var descendFrom = 100
    while(descendFrom >= 0) {
        print("$descendFrom ")
        descendFrom -= 2
    }
    println("\nWhile loop is done")

    // Do While Loop
    var doWhileExample = 196
    do
        print("${doWhileExample++} ")
    while(doWhileExample <= 10)
    println("\nDo While loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now!")
        }
    }

    // For loop
    for(num in 1..10)
        print("$num ")
    print("\n")
    for(i in 1 until 15)    // Same as - for(i in 1.until(15))
        print("$i ")
    print("\n")
    for(i in 10 downTo 1)
        print("$i ")
    print("\n")
    for(i in 100 downTo 82 step 2) // Same as - for(i in 100.downTo(82).step(2))
        print("$i ")
    print("\n")

    /*
     Write a for loop that runs from 0 to 10000
     Once it's at 9001 it should write "IT'S OVER 9000!!!"

     Write a while loop that checks the humidity (not the humidityLevel).
     The variable humidityLevel starts at 80. The variable humidity is
     initialized with "humid". If it is "humid" then it should reduce the
     "humidityLevel" by 5 and print "humidity decreased"
     Once the humidityLevel is below 60 it should print "it's comfy now"
     and set the humidity to "comfy"
    */
    for(num in 0..10000)
        if(num == 9001)
            println("IT'S OVER 9000!!!")

    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel == 60) {
            println("It's comfy now")
            humidity = "comfy"
        }
    }

    // Break & Continue
    for(i in 1..20){
        print("$i ")
        if(i / 2 == 5)
            break
    }
    println("\nBreak in the loop")

    for(i in 1..21){
        if(i / 2 == 5)
            continue
        print("$i ")
    }
    println("\nContinue in the loop")

}