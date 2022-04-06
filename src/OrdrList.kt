fun main(args: Array<String>){
    val loteryNumbers = listOf(11,22,43,56,78,66)
    //Ordena de menor a mayor
    val sortedNumber = loteryNumbers.sorted()
    println(sortedNumber)

    val decendantLoteryNumbers = loteryNumbers.sortedDescending()
    println(decendantLoteryNumbers)

    val orderByMultiplys = loteryNumbers.sortedBy{number-> number< 50}
    println(orderByMultiplys)

    val randomNumbers = loteryNumbers.shuffled()
    println(randomNumbers)

    val reverseNumbers =loteryNumbers.reversed()
    println(reverseNumbers)


    val messageNumbers = loteryNumbers.map { number -> "Tu numero es $number" }
    println(messageNumbers)
    val filterNumbers = loteryNumbers.filter { number-> number > 50}
    println(filterNumbers)
}

