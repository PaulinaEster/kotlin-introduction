package questoesLogica

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.util.*


/*
** Introdução
A onda (conhecida como a onda mexicana no mundo de língua inglesa fora da América do Norte)
é um exemplo de ritmo metacronal alcançado em um estádio lotado quando grupos sucessivos
* de espectadores se levantam brevemente, gritam e levantam os braços.
* Imediatamente após o alongamento até a altura máxima, o espectador retorna à posição sentada usual.

O resultado é uma onda de espectadores em pé que viaja pela multidão,
mesmo que os espectadores individuais nunca se afastem de seus assentos.
Em muitas arenas grandes, a multidão está sentada em um circuito
contíguo ao redor do campo esportivo e, portanto, a onda pode
* viajar continuamente pela arena; em arranjos de assentos descontínuos,
* a onda pode, em vez disso, refletir para frente e para trás na multidão.
* Quando a lacuna no assento é estreita, a onda às vezes pode passar por ela.
* Normalmente, apenas uma crista de onda estará presente em um determinado
*  momento em uma arena, embora ondas simultâneas e de rotação contrária tenham
* sido produzidas. (Fonte Wikipédia )
Tarefa
Neste Kata simples, sua tarefa é criar uma função que transforme uma corda em uma Onda Mexicana.
* Você receberá uma string e deverá retornar essa string em uma matriz em que uma letra maiúscula é uma pessoa em pé.

Regras
1. A string de entrada sempre será minúscula, mas talvez vazia.

 2. Se o caractere na string for um espaço em branco, passe por cima dele como se fosse um assento vazio

Exemplo
wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
Boa sorte e aproveite!
* */

final class OndaMexicana {
    fun wave(str: String): List<String> {
        val result: MutableList<String> = mutableListOf()
        val aux = str.split("").toMutableList()
        str.forEachIndexed { index: Int, element ->
                if(!element.isWhitespace()){
                    aux.replaceAll { it.lowercase() }
                    aux[index + 1] = aux[index + 1].uppercase()
                    result.add(aux.joinToString(""))
                }
        }
        return result
    }
}

fun main(){
    val teste = OndaMexicana()
}

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(listOf("A       b    ", "a       B    "), OndaMexicana().wave("a       b    "))
        assertEquals(listOf("This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS"), OndaMexicana().wave("this is a few words"))
        assertEquals(listOf<String>(), OndaMexicana().wave(""))
        assertEquals(listOf(" Gap ", " gAp ", " gaP "), OndaMexicana().wave(" gap "))
    }
}