package com.fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Gabriel", 21))

    println(carro.cor)
    carro.cor = "Preto"

    println(carro.cor)
    println(carro.dono.nome)

    carro.dono.nome = "Tatsuya"

    println(carro.dono.nome)
}