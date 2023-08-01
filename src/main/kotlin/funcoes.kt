fun main() {

    println(parabenizar(retornaNome()))
    println(parabenizar(retornaNome(), 20))
}

fun parabenizar(nome: String, idade:Int = 0): String{
    return "Parabéns ${nome}, pelos seus ${idade + 1} anos de idade!"
}

fun retornaNome():String{
    return "Paulina"
}
