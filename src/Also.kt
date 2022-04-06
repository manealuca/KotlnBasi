fun main(args: Array<String>){
    val movil = mutableListOf("Google pixel 2x","Xiami 9t", "Samsun A52").also {
        list->println("El valor original de la lista es $list")
    }.asReversed()
    println("El valor actual de la lista es: $movil")

}