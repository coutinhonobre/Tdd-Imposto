package com.example.tddtreinamentodepreco.model

data class Preco(
    var precoTabela: Double,
    var desconto: Double = 0.0,
    var ipi: Double = 0.0,
    var iva: Double = 0.0,
    var aliqIcms1: Double = 0.0,
    var aligIcms2: Double = 0.0,
    var pauta: Double = 0.0,
    var percentualRedBase: Double = 0.0,
    var vlUltEnt: Double = 0.0,
    var fecp: Double = 0.0
){

    fun precoBase() = precoTabela - ((precoTabela * desconto)/100)

    fun precoVlIpi() = precoBase() * (ipi/100)

    fun precoBaseComIPI() = precoTabela + precoVlIpi()

    fun baseStTemp() = (precoBaseComIPI()*(iva/100))+precoBaseComIPI()

    fun baseRedondo() = if (pauta > 0) pauta else baseStTemp() * (percentualRedBase / 100)

    fun st1() = if (vlUltEnt <= 0.0) baseRedondo() * (aliqIcms1/100) else vlUltEnt * (aliqIcms1/100)

    fun st2() = precoTabela * (aligIcms2 /100)

    fun st() = st1() - st2()

    fun calculoFecp() = baseRedondo() * (fecp/100)

    fun precoVenda() = st() + precoVlIpi() + precoBase() + calculoFecp()


}