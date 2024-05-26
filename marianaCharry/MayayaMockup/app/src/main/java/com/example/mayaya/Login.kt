package com.example.mayaya

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.historial)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnVolver =findViewById<Button>(R.id.btnVolverH)
        btnVolver.setOnClickListener{

            finish()
        }
    }
    fun cambioActivityMiPerfil(view: View){
        var intent= Intent(application,MiPerfil::class.java)
        startActivity(intent)
    }

    fun cambioLista(view: View){
        var intent= Intent(application,lista::class.java)
        startActivity(intent)
    }
}