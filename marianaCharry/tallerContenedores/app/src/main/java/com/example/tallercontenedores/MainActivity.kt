package com.example.tallercontenedores

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnCambioFragment1=
            findViewById<Button>(R.id.button1)

        var btnCambioFragment2=
            findViewById<Button>(R.id.button2)

        var btnCambioFragment3=
            findViewById<Button>(R.id.button3)

        var btnCambioFragment4=
            findViewById<Button>(R.id.button4)

        var btnCambioFragment5=
            findViewById<Button>(R.id.button5)

        var btnCambioFragment6=
            findViewById<Button>(R.id.button6)

        var btnCambioFragment7=
            findViewById<Button>(R.id.button7)



        btnCambioFragment1.setOnClickListener{
            cambioFragment(1)
        }

        btnCambioFragment2.setOnClickListener{
            cambioFragment(2)
        }

        btnCambioFragment3.setOnClickListener{
            cambioFragment(3)
        }
        btnCambioFragment4.setOnClickListener{
            cambioFragment(4)
        }
        btnCambioFragment5.setOnClickListener{
            cambioFragment(5)
        }
        btnCambioFragment6.setOnClickListener{
            cambioFragment(6)
        }
        btnCambioFragment7.setOnClickListener{
            cambioFragment(7)
        }
    }
    fun cambioFragment(position:Int){
        //position:indica el fragmento deseado
        //fragment: indica el fragmento a cambiar
        var fragment: Fragment
        when(position){
            //segun el valor de position
            //se va a cambiar el fragmento
            1->fragment=FirstFragment()
            2->fragment=secondFragment()
            3->fragment=thirdFragment()
            4->fragment=fourthFragment()
            5->fragment=fifthFragment()
            6->fragment=sixthFragment()
            7->fragment=seventhFragment()
            else-> fragment=FirstFragment()
        }
        //supportFragmentManager es el que gestiona el cambio de fragmentos
        val fragmentManager=supportFragmentManager

        //se crea el objeto de la transicin del fragmento
        val fragmentTransition=fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.FCV,fragment)

        fragmentTransition.commit()
    }
}