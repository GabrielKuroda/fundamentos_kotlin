package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

    ML001("ML-001", "Invalid Request"),
    ML101("ML-101", "Book [%s] not exists"),
    ML102("ML-102", "Cannot update Book with status [%s]"),
    ML201("ML-201", "Customer [%s] not exists"),
    ML202("ML-202", "Cannot update Customer with status [%s]")

}