const val Pi = 3.1416;

fun main(args: Array<String>){
    var money : Int = 100;
    println(money)
    money = 3;
    println(money)
    val name ="Luca";
    println(name);

    println(Pi);

    val boolean = true;
    val longNumber = 3L;
    val float =1.1f;

    val name2 = "Christian";
    val completeName = "Mi nombre es $name $name2";
    println(completeName);



    if(name.isNotEmpty()) println("El largo de nuestra variable nombre es: ${name.length}")else println("Error, la variable nombre esta vacia")

/*
    var mesaje : String;
    if(name.length >=4){
        mesaje = "Mi nombre es Largo"
    }else{
        mesaje = "Mi nombre es corto"
    }
    println(mesaje)*/

    val mesaje: String = if(name.length >=4) {"Mi nombre es largo"}else if (name.isEmpty()){
        "El nombre no se a asignado correctamente"
    } else{
        "Mi nombre es corto"
    }
    println(mesaje);
}