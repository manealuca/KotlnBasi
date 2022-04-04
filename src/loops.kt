fun main(args: Array<String>){
    var cont = 10
    while (cont>0){
        println("El valor de contador es $cont")
        cont--
    }

    do {
        val randomNumber = (0..100).random()
        println("El numero aleatiruo es $randomNumber")

    }while(randomNumber > 30)

    val listaDeFrutas = listOf("Manzana","Fresa","Durasno","Pera","Uvas")
    for (fruta in  listaDeFrutas){
        println("La fruta del dia es $fruta")
    }
    listaDeFrutas.forEach{ fruta-> println("Hoy comere una fruta nueva $fruta")}

    val fruitChars = listaDeFrutas.map { fruit-> fruit.length }
    println(fruitChars)
    val filterList = fruitChars.filter { fruit-> fruit > 5 }
    println(filterList)
}