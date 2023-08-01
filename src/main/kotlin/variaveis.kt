fun main(){

    var nome = "Paulina"

    val nomeVal = "Paulina"

    nome = "Paulina Ester"
   /* nomeVal = "Ester" */

    val idade = 21
    println(idade)

    val teste: String

    var texto = ""
}

class Variaveis{

    var teste: String = "Deve ser inicializada quando colocada aqui"

    lateinit var variavelInicializadaDepois: String

    fun setVariavelInicializadaDepois(){
        variavelInicializadaDepois = "Inicializada após a declaração do objeto"
    }


}

