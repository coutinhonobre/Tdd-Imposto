package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Test

class CalcularPrecoTabelaBaseComIPI {

    @Test
    fun calcularPrecoBaseComIPITtest(){
        var preco = Preco(100.0, ipi = 10.0)
        assertEquals(preco.precoBaseComIPI(), 110.0, 0.00001)
    }

    @Test
    fun calcularPrecoBaseComIPIZeroTtest(){
        var preco = Preco(100.0)
        assertEquals(preco.precoBaseComIPI(), 100.0, 0.00001)
    }
}