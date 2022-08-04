package com.fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))

    resultadoDaNota(7)
}

fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0)
        "Par"
    else
        "Impar"
}

fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("Passou")
    }else if(nota >= 4){
        println("Recuperação")
    }else{
        println("Reprovou")
    }
}