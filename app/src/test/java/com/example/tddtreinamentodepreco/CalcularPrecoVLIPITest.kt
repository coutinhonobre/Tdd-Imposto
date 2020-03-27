package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Test

class CalcularPrecoVLIPITest {

    @Test
    fun calcularValorIPITest(){
        var preco = Preco(precoTabela = 100.0, ipi = 10.0)
        assertEquals(preco.precoVlIpi(), 100.0*0.10, 0.00001)
    }

    @Test
    fun calcularValorIPIZeroTest(){
        var preco = Preco(precoTabela = 100.0, ipi = 0.0)
        assertEquals(preco.precoVlIpi(), 0.0, 0.00001)
    }

}