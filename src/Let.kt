fun main(args: Array<String>){
    var name:String? = null
    name?.let{
        value-> println("El nombre no es nulo el valor es $value")
    }
    name = "Luca"
    name?.let{
        value-> println("El nombre no es nulo el valor es $value")
    }
}