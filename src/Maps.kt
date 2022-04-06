fun main(args:Array<String>){
    val HerosAge = mapOf(
        "IronMan" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )

    println(HerosAge)
    val MutableHerosAge = mutableMapOf(
        "IronMan" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(MutableHerosAge)
    MutableHerosAge.put("Wolverine",45)
    println(MutableHerosAge)

    MutableHerosAge["Storm"] = 30
    println(MutableHerosAge)
    val IronmanAge = MutableHerosAge["IronMan"]
    println(IronmanAge)

    MutableHerosAge.remove("Wolverine")
    println(MutableHerosAge)
    println(MutableHerosAge.keys)
    println(MutableHerosAge.values)
    
}