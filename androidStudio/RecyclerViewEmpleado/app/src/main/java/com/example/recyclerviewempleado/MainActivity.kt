package com.example.recyclerviewempleado

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewempleado.adapter.adapterEmployed
import com.example.recyclerviewempleado.models.employed

class MainActivity : AppCompatActivity() {

    lateinit var listEmployed:MutableList<employed>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listEmployed= mutableListOf()
        var employed=employed("Carlos", "Instructor")
        listEmployed.add(employed)
        listEmployed.add(employed("Mariana","Aprendiz"))
        listEmployed.add(employed("Aura","Aprendiz"))
        listEmployed.add(employed("Maria Jose","Aprendiz"))
        listEmployed.add(employed("Isabella","Aprendiz"))
        listEmployed.add(employed("Carolina","Aprendiz"))
        listEmployed.add(employed("Mateo","Aprendiz"))
        listEmployed.add(employed("Marcos","Aprendiz"))
        listEmployed.add(employed("Monica","Aprendiz"))
        listEmployed.add(employed("Manuel","Aprendiz"))

        var recycler=findViewById<RecyclerView>(R.id.RVEmployed)
        recycler.layoutManager=LinearLayoutManager(applicationContext)

        var adapterEmployed=adapterEmployed(listEmployed,applicationContext)
        recycler.adapter=adapterEmployed

    }
}