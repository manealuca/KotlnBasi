fun main(args:Array<String>){
    val fullName = listOf("Luca","Cristian","Manea")
    printName(fullName[0],fullName[1],fullName[2])
}


fun printName(name: String,SecondName: String= "",lastname:String){
    println("Mi nombre es: $name $SecondName \nMi apellido es: $lastname " )
}