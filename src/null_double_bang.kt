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

    val firstValue = 10
    val secondValue = 0
    val result : Int = try{ firstValue / secondValue} catch (exception : Exception){0}
    println(result)


}