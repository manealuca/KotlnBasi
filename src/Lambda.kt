fun main(args: Array<String>){
    val myLambda:(String)->Int = { value ->value.length }
    val executedLambda = myLambda("Hola mama estoy programando")
    println(executedLambda)

    val hi = listOf("Hello","Hola","Ciao")
    val hiLength = hi.map(myLambda)
    println(hiLength)

}