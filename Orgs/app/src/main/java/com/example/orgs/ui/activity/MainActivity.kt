package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.modelo.Produto
import com.example.orgs.ui.recyclerView.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "Teste", descricao = "Teste desc", valor = BigDecimal("19,99")),
            Produto(nome = "Teste 2", descricao = "Teste desc 2", valor = BigDecimal("29,29")),
            Produto(nome = "Teste 3", descricao = "Teste desc 3", valor = BigDecimal("39,93"))
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}