package com.fundamentos

// Fun -> Indica função
// Unit == void
// Pode ser omitido
fun main(): Unit {
    var nome = retornaNome()
    println(nome)
    dizOi(nome)
    dizOi(nome,21)
}

fun retornaNome(): String {
    return "Gabriel"
}

fun dizOi(nome: String, idade: Int = 18) {
    println("Oi ${nome}, parabéns pelos ${idade} anos!")
}