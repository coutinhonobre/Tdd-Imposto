package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Test

class CalcularPrecoBaseTest {

    @Test
    fun deveEncontrarPrecoBaseDescontoZero(){
        var preco = Preco(100.0)
        assertEquals(preco.precoBase(), 100.0, 0.00001)
    }

    @Test
    fun deveEncontrarPrecoBaseDescontoMaiorQueZero(){
        var preco = Preco(100.0, 10.0)
        assertEquals(preco.precoBase(), 90.0, 0.00001)
    }

    @Test
    fun deveEncontrarPrecoBaseComAcrescimo(){
        var preco = Preco(100.0, -10.0)
        assertEquals(preco.precoBase(), 100.0, 110.0)
    }

}