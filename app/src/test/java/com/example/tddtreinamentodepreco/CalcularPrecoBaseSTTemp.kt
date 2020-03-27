package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalcularPrecoBaseSTTemp {

    lateinit var preco: Preco

    @Before
    fun inicializarPreco(){
        preco = Preco(100.0)
    }


    @Test
    fun calcularBaseStTempTest(){
        preco.iva = 10.0
        preco.ipi = 10.0
        assertEquals(preco.baseStTemp(), 121.0, 0.00001)
    }

    @Test
    fun calcularBaseStTempZeroTest(){
        preco.iva = 0.0
        preco.ipi = 0.0
        assertEquals(preco.baseStTemp(), 100.0, 0.00001)
    }


}