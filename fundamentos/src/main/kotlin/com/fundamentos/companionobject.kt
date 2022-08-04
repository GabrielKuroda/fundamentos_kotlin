package com.fundamentos

class MinhaClasse (
    var nome: String
        ) {
    companion object {
        fun criarClasse(): MinhaClasse {
            return MinhaClasse("Gabriel")
        }
    }
}

class SegundaClasse (
    var nome: String
) {
    fun criarClasse(): MinhaClasse {
        return MinhaClasse("Gabriel")
    }

}

fun main() {
    var segundaClasse = SegundaClasse("nome").criarClasse()
    var minhaClasse = MinhaClasse.criarClasse()
}