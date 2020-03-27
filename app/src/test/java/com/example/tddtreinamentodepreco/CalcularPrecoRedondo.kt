package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalcularPrecoRedondo {

    lateinit var preco: Preco

    @Before
    fun inicializar(){
        preco = Preco(100.0)
    }

    @Test
    fun calcularPrecoBaseRedondoSemPauta(){
        preco.ipi = 10.0
        preco.iva = 10.0
        preco.percentualRedBase = 100.0
        assertEquals(preco.baseRedondo(), 121.0, 0.00001)
    }

    @Test
    fun calcularPrecoBaseRedondoSemPautaRedBase(){
        preco.ipi = 10.0
        preco.iva = 10.0
        preco.percentualRedBase = 90.0
        assertEquals(preco.baseRedondo(), 108.9, 0.00001)
    }

    @Test
    fun calcularPrecoBaseRedondoSemPautaRedBaseCemDezPorcento(){
        preco.ipi = 10.0
        preco.iva = 10.0
        preco.percentualRedBase = 110.0
        assertEquals(preco.baseRedondo(), 133.1, 0.00001)
    }

    @Test
    fun calcularPrecoBaseRedondoSemPautaRedBaseCemPorcento(){
        preco.ipi = 10.0
        preco.iva = 10.0
        preco.percentualRedBase = 110.0
        assertEquals(preco.baseRedondo(), 133.10, 0.00001)
    }

    @Test
    fun calcularPrecoBaseRedondoComPauta(){
        preco.pauta = 10.0
        assertEquals(preco.baseRedondo(), 10.0, 0.00001)
    }

}