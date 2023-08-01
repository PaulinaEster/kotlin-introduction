package questoesLogica

import junit.framework.TestCase.assertEquals
import org.junit.Test

/*
* * Tarefa
Dada uma string str, inverta-a e omita todos os caracteres não alfabéticos.

Exemplo
Para str = "krishan", a saída deve ser "nahsirk".

Para str = "ultr53o?n", a saída deve ser "nortlu".

Entrada/Saída
[input]cordastr
Uma string consiste em letras latinas minúsculas, dígitos e símbolos.

[output]uma linha
 */

final class LetraReversa {

    fun reverseLetter(str: String): String {
        return str.reversed().replace(("[^A-Za-z]").toRegex(), "")
    }
}

class TestReverseLetter {
    @Test
    fun `Basic Tests` () {
        val str = "krishan"
        assertEquals("nahsirk", LetraReversa().reverseLetter("krishan"))
        assertEquals("nortlu", LetraReversa().reverseLetter("ultr53o?n"))
        assertEquals("cba", LetraReversa().reverseLetter("ab23c"))
        assertEquals("nahsirk", LetraReversa().reverseLetter("krish21an"))
    }
}