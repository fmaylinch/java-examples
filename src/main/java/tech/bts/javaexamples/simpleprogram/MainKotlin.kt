package tech.bts.javaexamples.simpleprogram

fun main(args: Array<String>) {

    println("Hello, world!")

    // Declare variable
    var age : Int
    var name : String

    // Assign a value
    age = 15

    // Declare and assign
    var weight : Double = 40.5

    // Type inferred from value (Double)
    // This can be done in Java 10
    var height = 150.0

    // if
    if (age >= 18) {
        println("adult")
    } else if (age >= 13) {
        println("teenager")
    } else {
        println("kid")
    }

    // while
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // for loop (in range)
    for (j in 1..10) {
        println(j)
    }

    // Create empty list and add values
    var names = mutableListOf<String>()
    names.add("potato")
    names.add("carrot")

    println( names.get(0) )

    // Create a immutable list with some values
    var numbers = listOf(8, 4, 6, 5)
    // Can't do it: numbers.add(3)

    // Map
    var ages = mutableMapOf<String, Int>()
    ages.put("John", 30)
    ages.put("Mary", 25)
    println( ages.get("Mary") )

    // Constant "variables" (can't change again)
    val price = 200
    val discount = 10
    val finalPrice = price - discount
    println("The final price is $finalPrice")
    // Can't do it: finalPrice = price

    printHello("Peter", 35)

    val p = power(2.0, 10)
    println("2^10 = $p")
}

fun power(base: Double, exponent: Int) : Double {

    var result = 1.0

    for (i in 1..exponent) {
        result *= base
    }

    return result
}

fun printHello(name: String, age: Int) {

    println("hello $name, you are $age")
}
