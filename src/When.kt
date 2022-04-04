fun main(args: Array<String>){
    var nameColor = "blue"
    when(nameColor){
        "yellow"-> println("El amarillo es el color del sol");
        "blue", "azul Marino"-> println("Este color simbolisa el mar");
        else-> println("Error no tengo informacion del color")
    }

    val code = 501
    when(code){
        in 200..299-> println("Todo esta bien")
        in 400..500-> println("Algo  ha fallado")
        else-> println("Codigo desconocido, algo ha fallado")
    }


    val number = 200
    when(number){
        in 0..199-> println("Peticion exitosa")
        in 200..404-> println("Error desconocido peticion fallida")
        else-> println("Error desconocido intente mas tarde")
    }
}