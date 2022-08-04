package com.fundamentos

fun main() {
    //Imutavel
    var lista = listOf(1,2,3)
    val pares = lista.filter { it % 2 == 0 }

    println(pares)

    for (numero in lista){
        println(numero)
    }

    //Mutavel
    var listaMutavel = mutableListOf(1,3,7,9,4,5)
    listaMutavel.add(6)
    listaMutavel.removeAt(0)
    listaMutavel.remove(3)
    listaMutavel.sort()

    println(listaMutavel)

    //Set

    var setNumeros = setOf(1,2,3,2)
    var setNumerosMutavel = mutableSetOf(1,2,3,2)

    println(setNumeros)

    //Map
    var mapNomeIdade = mapOf("Gustavo" to 24, "Daniel" to 21)
    var mapNomeIdadeMutavel = mutableMapOf("Gustavo" to 24, "Daniel" to 21)

    mapNomeIdadeMutavel.put("Bruno",20)
    mapNomeIdadeMutavel.putIfAbsent("Bruno",20)
    mapNomeIdadeMutavel.remove("Bruno")

}