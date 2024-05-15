package com.example.ttc_login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ttc_login.databinding.ActivityFormCadastroBinding

class form_cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityFormCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityFormCadastroBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(binding.root)
        binding.btRegister.setOnClickListener {
            val navegarTelaLogin = Intent(this,form_login::class.java)
            startActivity(navegarTelaLogin)

        }
    }
}