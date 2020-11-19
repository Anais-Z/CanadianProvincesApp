package com.example.anais_zulfequar_3

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val data: ArrayList<String>, val content : Context){

    class MyViewFolder(itemView: View) : RecyclerView.ViewHolder(itemView) { //step 1 - extend recycler view
    }

    override  fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewFolder{
        return MyViewFolder(LayoutInflater.from(content).inflate(R.layout.row, parent, false))
    }
    override fun onBindViewHolder(holder: MyViewFolder, position: Int){
      //  holder.itemView.provinceName.text = data[position].name
        //holder.itemView.capitalText.text = data[position].capital
    }

    override fun getItemCount(): Int{
        return data.size
    }
}