package com.fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}. Idade: ${idade}"
    }
}

fun main() {
    var gabriel = Pessoa("Gabriel", 21)
    println(gabriel)
}