class CondicoesIf {

    fun retornaMaior(num1: Int, num2: Int): Int{
        return if(num1 > num2) num1
        else num2
    }

    fun resultadoMedias(num1: Int, num2: Int): String {
        if((num1 + num2)/2 > 6){
            return "Passou"
        }
        return "Burro"
    }
}
class CondicoesWhen {

    fun retornaMaior(num1: Int, num2: Int): Int{
        return when(num1 > num2) {
           true -> num1
           false -> num2
        }
    }

    fun retornaMaiorTres(num1: Int, num2: Int, num3: Int): Int{
        return when{
            num1 > num2 && num1 > num3 -> num1
            num3 > num1 && num3 > num2 -> num3
            num2 > num1 && num2 > num3 -> num2
            else -> 0
        }
    }

    fun resultadoMedias(num1: Int, num2: Int): String {

        val res: String = when((num1 + num2)/2 > 6){
            true -> "Passou"
            false-> "Burro"
        }
        return res
    }
}
fun main(){

}
 