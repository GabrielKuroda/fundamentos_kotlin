package com.fundamentos

fun main() {
    printa1a10()
    println("DownTo")
    printa10a1()
    println("Step")
    printaPar1a10()
    println("While")
    whileMenorQue10()
    println("doWhile")
    doWhile()
}

fun doWhile(){
    var x = 10
    do{
        println(x)
        x++
    }while(x < 10)
}

fun whileMenorQue10() {
    var x = 0
    while(x < 10){
        println(x)
        x++
    }
}

fun printa1a10() {
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun printa10a1() {
    for(numero in 10 downTo  1){
        println(numero)
    }
}

fun printaPar1a10() {
    for(numero in 2 .. 10 step 2){
        println(numero)
    }
}

