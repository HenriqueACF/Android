package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.recyclerView.adapter.ListaProdutosAdapter

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de Frutas")
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.setText("Laranja, Maçã e Uva")
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.setText("R$ 19.99")

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }
}