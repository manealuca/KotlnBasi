fun main(args:Array<String>){
    val initialValueLength = superFunction(inicialValue = "Hola mama") { value -> value.length }
    println(initialValueLength)
    val lambda =    InceptionFunction("Luca")
    val lambdaValue: String = lambda()
    println(lambdaValue)
}

fun superFunction(inicialValue: String,block:(String)->Int): Int{
    return  block(inicialValue)
}

fun InceptionFunction(name: String):()-> String{
    return {
        "Hola desde la lambda $name"
    }
}