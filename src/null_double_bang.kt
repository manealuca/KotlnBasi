import java.lang.NullPointerException

fun main(args: Array<String>){
    var secondName: String? = "Luca"
    println(secondName)
    var name : String? = null
    //name!!.length
    try {
        throw NullPointerException("Referencia nula")
    } catch ( exeption :NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error.. cerranod la aplicacion")
    }
}