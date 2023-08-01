class Carro (val cor: String, val ano: Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro: Carro = Carro("Laranja", 2000, Dono("Naruto", 21))

    println(carro.cor)
    println(carro.dono.nome)

    carro.dono.nome = "Itachi"
    println(carro.dono.nome)
    println(carro.dono.idade)
}
