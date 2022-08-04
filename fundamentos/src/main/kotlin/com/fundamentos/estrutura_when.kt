package com.fundamentos

fun main() {

    val x = 5

    when(x) {
        5, -5 -> println("x == 5 Ou x == -5")
        in 6..9 -> println("x está entre 6 e 9")
        10 -> {
            println("x == 10")
            println("X é uma dezena")
        }
        !in 16..20 -> println("Numero não está entre 16 e 20 ")
        else -> println("Numero não mapeado")
    }

    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi") -> println("oi")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when(x){
        is String -> x.startsWith("oi")
        else -> false
    }
}