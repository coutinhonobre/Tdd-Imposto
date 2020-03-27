package com.example.tddtreinamentodepreco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tddtreinamentodepreco.model.Preco
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var preco: Preco

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preco = Preco(100.00)



        buttonCalcular.setOnClickListener{
            preco.precoTabela = editTextPrecoTabela.text.toString().toDouble()
            preco.desconto = if(editTextDesconto.text.isNotEmpty() && editTextDesconto.text.toString().toDouble() > 0) editTextDesconto.text.toString().toDouble() else 0.0
            editTextPrecoBase.setText(preco.precoBase().toString())
        }

    }

}    

