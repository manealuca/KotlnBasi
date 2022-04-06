fun main(args: Array<String>){
    val randomphrase = "Nunca pares de aprender"
    printPhrase(randomphrase.randomCase())
}


//Funcion clasica
fun printPhrase(frase:String):Unit{
    println("Tu frase es $frase")
}

//Funcion de Extencion
fun String.randomCase() : String{
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    if(randomResult.rem(2) == 0){
        return this.toUpperCase()
    }
    return this.toLowerCase()
}

