package com.fundamentos

fun retornaNumeroPorExtenso(numero: Int): String{
    if(numero == 5){
        return "Cinco"
    } else if(numero == 6){
        return "Seis"
    }
    return "Numero não Mapeado"
}

fun main() {
    println(retornaNumeroPorExtenso(5))
}