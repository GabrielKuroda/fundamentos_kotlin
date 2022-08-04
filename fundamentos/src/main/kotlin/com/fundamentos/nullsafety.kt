package com.fundamentos

fun main() {

    //Nullable
    var nome: String? = "Gabriel"

    println(nome?.length)
    println(nome?.length?.toShort())

    //Da certeza que não é nulo
    println(nome!!.length.toShort())

    //Elvis Operator, se for nulo joga 0
    var tamanho: Int =  nome?.length ?: 0

    var listaQueAceitaValoresNull: List<Int?>
    var ListaQuePodeSerNull: List<Int>?
}