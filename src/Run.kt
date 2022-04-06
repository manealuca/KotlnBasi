
fun main(args: Array<String>){
    val moviles = mutableListOf("Google pixel2xl","Xiaomi 9t","Samsun galaxy a52")
        .run{
            removeIf{movil->movil.contains("Google")}
            this
        }
    println(moviles)

    val colors = mutableListOf<String>("Yellow","Blue","Red")
    colors?.apply { println("Nuestros colores son $this")
        println("La cantidad de colores es de: $size")
    }
}