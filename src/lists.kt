fun main(args: Array<String>){
    val listOfNames = listOf("Juan","Luca","Enrique","Christian")
    println(listOfNames)


    val emptyList = mutableListOf<String>()
    println(emptyList)
    emptyList.add("Juan")
    println(emptyList)
    val getValue = emptyList.get(0)
    println(getValue)
    val getValueWithOperator = emptyList[0]
    println(getValueWithOperator)
    val firstValue = listOfNames.firstOrNull()
    println(firstValue)

    emptyList.removeAt(0)
    println(emptyList)
    emptyList.add("Luca")
    println(emptyList)
    emptyList.removeIf{ chars-> chars.length > 3}
    println(emptyList)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array ${myArray.toList()}")
}