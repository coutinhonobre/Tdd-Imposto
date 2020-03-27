package com.example.tddtreinamentodepreco

import com.example.tddtreinamentodepreco.model.Preco
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalcularST {

    private lateinit var preco: Preco

    @Before
    fun inicializar(){
        preco = Preco(100.0)
        preco.ipi = 10.0
        preco.iva = 10.0
        preco.aliqIcms1 = 10.0
        preco.aligIcms2 = 1.0
        preco.percentualRedBase = 100.0
    }

    @Test
    fun calcularSt1ZeroValorUltimaEntrada(){
        assertEquals(preco.st1(), 12.1, 0.00001)
    }

    @Test
    fun calcularSt1DiferenteZeroValorUltimaEntrada(){
        preco.vlUltEnt = 10.0
        assertEquals(preco.st1(), 1.0, 0.00001)
    }

    @Test
    fun calcularSt2(){
        assertEquals(preco.st2(), 1.0, 0.00001)
    }

    @Test
    fun calcularSt(){
        assertEquals(preco.st(), 11.1, 0.00001)
    }

    @Test
    fun calcularFecpZero(){
        assertEquals(preco.calculoFecp(), 0.0, 0.00001)
    }

    @Test
    fun calcularFecpDiferenteDeZero(){
        preco.fecp = 10.0
        assertEquals(preco.calculoFecp(), 12.10, 0.00001)
    }

    @Test
    fun calcularPrecoVenda(){
        preco.desconto = 1.0
        assertEquals(preco.precoVenda(), 119.989, 0.00001)
    }

    @Test
    fun calcularPrecoVendaFecp(){
        preco.fecp = 1.0
        preco.desconto = 0.0
        assertEquals(preco.precoVenda(), 122.30999,.00001)
    }

}