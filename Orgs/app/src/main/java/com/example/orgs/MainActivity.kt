package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.setText("Cesta de Frutas")

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.setText("Laranja, Maçã e Uva")

        val valor = findViewById<TextView>(R.id.valor)
        valor.setText("R$ 19.99")
    }
}