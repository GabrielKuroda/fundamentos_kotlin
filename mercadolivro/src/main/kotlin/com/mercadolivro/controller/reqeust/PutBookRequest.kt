package com.mercadolivro.controller.reqeust

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal

class PutBookRequest (
    var name: String?,

    var price: BigDecimal?
)
