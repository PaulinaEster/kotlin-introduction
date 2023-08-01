package questoesLogica

import org.junit.Test

/*
Comecemos com um exemplo:
Pegue um número: 56789.
Gire para a esquerda, você obtém 67895.

Mantenha o primeiro dígito no lugar e gire para a esquerda os outros dígitos: 68957.

Mantenha os dois primeiros dígitos no lugar e gire os outros: 68579.

Mantenha os três primeiros dígitos e gire para a esquerda o restante: 68597.
Agora acabou pois guardando os quatro primeiros resta apenas um dígito que girado é ele mesmo.

Você tem a seguinte sequência de números:

56789 -> 67895 -> 68957 -> 68579 -> 68597

e você deve devolver o maior: 68957.

Tarefa
Escreva function max_rot(n)que, dado um número inteiro positivo, nretorna o número máximo que você obteve fazendo rotações semelhantes ao exemplo acima.

Então max_rot(ou maxRotou... dependendo do idioma) fica assim:

max_rot(56789) should return 68957

max_rot(38458215) should return 85821534
* */

final class GireParaUmMaximo {
    fun maxRot(n:Long):Long {


        return n
    }

}

fun main(){
    val girar = GireParaUmMaximo()
    girar.maxRot(1)

}


class Test{
    @Test
    fun basicTests(){

    }
}