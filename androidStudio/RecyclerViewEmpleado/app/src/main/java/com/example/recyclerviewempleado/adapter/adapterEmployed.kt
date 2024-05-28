package com.example.recyclerviewempleado.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.recyclerviewempleado.models.employed
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewempleado.R
import java.text.FieldPosition

//esta clase es la encargada de cargar los datos al recyclerView
//para instanciar la clase se requiere uno parametros
//primero, la lista de los elementos
//segundo, el contexto de la aplicación

//esta clase debe heredar de la clase RecyclerView.Adapter
class adapterEmployed

    (var listEmployed: List<employed>,
     var context:Context
            ): RecyclerView.Adapter<adapterEmployed.MyHolder>()
{

                inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){

                    lateinit var lblName:TextView
                    lateinit var lblPosition: TextView

                    init {
                        lblName=itemView.findViewById(R.id.lblName)
                        lblPosition=itemView.findViewById(R.id.lblPosition)

                    }
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterEmployed.MyHolder {
        var itemView=LayoutInflater.from(context).inflate(R.layout.item_employed,parent,false)
        return MyHolder(itemView)
    }

    //
    override fun onBindViewHolder(holder: adapterEmployed.MyHolder, position: Int) {

        //obtenemos el registro
        var employed=listEmployed[position]
        //asignar los valores
        holder.lblName.text=employed.name
        holder.lblPosition.text=employed.position

    }

    //el metodo getItemCount retorna el numero de elementos de la lista
    override fun getItemCount(): Int {
        return listEmployed.size
    }
}