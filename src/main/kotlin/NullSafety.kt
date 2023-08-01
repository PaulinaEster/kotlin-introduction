class NullSafety {
}

fun main(){
    var lista: List<Int?> = listOf(1, 2, 3, null, 5)
    var listaNullable : List<Int?>? = null

    var nome: String? = null

    var tamanho: Int = nome?.length ?: 0

    var sobrenome: String? = "Rehbein"

    if(sobrenome != null){
        println(sobrenome.length)
    }

    val toShort: Short = sobrenome!!.length.toShort()

    val pessoa: Pessoa? = null
    println(pessoa!!.nome)
    println("Final do codigo")


}
