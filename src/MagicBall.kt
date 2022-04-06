import java.util.spi.ResourceBundleProvider

const val  RESPUESTA_AFIRMATIVA = "V"
const val  RESPUESTA_NEGATIVA ="F"
const val  RESPUESTA_DUDOSA = "?"

val answers = mapOf(
    "si" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "No puede decirte en este momento" to RESPUESTA_DUDOSA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No centes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA
)

fun main(args: Array<String>){
    println("Hola soy tu bola 8 magica creada en kotln.")
    do{
        println( "Cual de esta opciones desea realizar?\n1.Realizar una pregunta\n2.Revisar toodas las respuestas\n3.Salir")
        var value = readLine()
        when(value){
            "1"-> question()
            "2"->showAnswers()
            "3"->getOut()
            else-> showError()
        }
        println("Desea realizar otra operacion?\n0.Salir")
        var option = readLine()
        if (option == "0")  {
            value = "3"
            getOut()
        }
    }while (value != "3")
}


fun question(){
    println("Que pregunta desaeas Realizar?")
    readLine()
    println("Asi que esa es tu pregunta... La respues es:")
    val answer = answers.keys.random()
    println(answer)
}

fun showAnswers(){
    println("Seleccion una opcion\n1.Revisar todas las respuestas\n2.Revisar las respuesta positivas\n3.Revsar las respuestas negativas\n4.Revisar las respuestas dudosas")
    val option = readLine()
    when(option){
        "1"->showAnswersByType()
        "2"->showAnswersByType(tipeResponse = RESPUESTA_AFIRMATIVA)
        "3"->showAnswersByType(tipeResponse = RESPUESTA_NEGATIVA)
        "4"->showAnswersByType(tipeResponse = RESPUESTA_DUDOSA)
        else->println("Opcion no valida adios...")
    }
}

fun showAnswersByType(tipeResponse : String = "TODOS") {
    when(tipeResponse){
        "TODOS"->answers.keys.forEach{response-> println(response)}
        RESPUESTA_AFIRMATIVA-> answers.filterValues { values-> values == RESPUESTA_AFIRMATIVA
        }.also { positiveAnswers-> println(positiveAnswers.keys) }
        RESPUESTA_NEGATIVA-> answers.filterValues { values-> values == RESPUESTA_NEGATIVA
        }.also { negativeAnswers-> println(negativeAnswers.keys)}
        RESPUESTA_DUDOSA-> answers.filterValues { values-> values == RESPUESTA_DUDOSA
        }.also { dubtAnswer-> println(dubtAnswer.keys) }

    }

}

fun getOut(){
    println("Hasta luego")
}

fun showError(){
    println("Parece que ahs elegido una opcion no valida por favor intenta de nuevo")
}