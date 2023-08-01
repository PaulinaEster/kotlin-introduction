package questoesLogica

import org.junit.Assert.*
import java.util.Arrays
import org.junit.Test
import kotlin.reflect.typeOf

/*
* Take 2 strings s1 and s2 including only letters from a to z.
* Return a new sorted string, the longest possible,
* containing distinct letters - each taken only once - coming from s1 or s2.
* Examples:
* a = "xyaabbbccccdefww"
* b = "xxxxyyyyabklmopq"
* longest(a, b) -> "abcdefklmopqwxy"
* a = "abcdefghijklmnopqrstuvwxyz"
* longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
* */

private final class TwotoOne {

    fun longest(s1:String, s2:String):String {
        val result: String = s1.plus(s2)
        val list: List<String> = result.split("").toSet().toList().sorted()
        return  list.joinToString(separator = "")
    }
}

class TwoToOneTest {
    @Test
    fun test() {
        println("longest Fixed Tests")
        assertEquals("aehrsty", TwotoOne().longest("aretheyhere", "yestheyarehere"))
        assertEquals("abcdefghilnoprstu", TwotoOne().longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
        assertEquals("acefghilmnoprstuy", TwotoOne().longest("inmanylanguages", "theresapairoffunctions"))

    }

}
