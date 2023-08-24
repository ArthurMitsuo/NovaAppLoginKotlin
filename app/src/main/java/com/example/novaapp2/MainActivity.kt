package com.example.novaapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proximaTela (nomeUsuario: String){
        val novaTela: Intent = Intent(this, MainActivity2::class.java)
        ovaTela.putExtra(nomeUsuario:)
    }

    fun botaoLogin(elemento: View){
        val editTextUsername: EditText = findViewById(R.id.editTextLogin)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)

        
    }
}