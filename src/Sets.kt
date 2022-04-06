fun main(args: Array <String>){

    //los sets no admiten duplivado asi que al compilar no se veran reflejados los valores repetidos
    val vocales = setOf("a","e","i","o","u","e","i","e","i","u")
    println(vocales)
/*en los sets se eliminan los elementos segun el valor no el indice asi que al remover un elemento
  del set se eliminan todos los  elementos que coincidan con el valor ingresado
  */
    val favoriteNumbers = mutableSetOf(1,2,3,4,5)
    println(favoriteNumbers)
    favoriteNumbers.add(5)
    println(favoriteNumbers)
    favoriteNumbers.remove(5)
    println(favoriteNumbers)

    val setValue: Int? = favoriteNumbers.firstOrNull{ number-> number>2}
    println(setValue)
}