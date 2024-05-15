package com.example.ttc_login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ttc_login.databinding.ActivityFormLoginBinding


    class form_login : AppCompatActivity() {

    private lateinit var binding: ActivityFormLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        setContentView(binding.root)

        binding.txtcadastro.setOnClickListener {
            val navegarTelaCadastro = Intent(this,form_cadastro::class.java)
        startActivity(navegarTelaCadastro)
        }

        }
       }

