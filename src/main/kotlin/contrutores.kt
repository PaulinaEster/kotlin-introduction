
class Pessoa(val nome: String, val idade: Int){

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}

fun main(){
    var paulina = Pessoa("Paulina", 21)
    println(paulina)
}