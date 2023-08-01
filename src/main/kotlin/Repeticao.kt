class Repeticao {

}

fun main(){

}

fun whileAntes(){
    println("While antes")
    var x = 6
    while (x > 3){
       println(x)
       x--
    }
}

fun doWhile(){
    var x = 3
    do{
         println(x)
        x--;
    }while (x>0)
}

fun forInComNumero(){
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun forInComLista(){
    var list = intArrayOf(1,2,3,4,5,6,7)
    for(numero in list){
        println(numero)
    }
}



