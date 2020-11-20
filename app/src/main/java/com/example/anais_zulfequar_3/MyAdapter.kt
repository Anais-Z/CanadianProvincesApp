package com.example.anais_zulfequar_3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val data: ArrayList<Province>, val content: Context) : RecyclerView.Adapter<MyAdapter.MyViewFolder>() {

    class MyViewFolder(itemView: View) : RecyclerView.ViewHolder(itemView)/*View.OnClickListener*/ { //step 1 - extend recycler view

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewFolder{
        return MyViewFolder(LayoutInflater.from(content).inflate(R.layout.row, parent, false))

    }
    override  fun onBindViewHolder(holder: MyViewFolder, position: Int){
        holder.itemView.provinceName.text = data[position].name
        holder.itemView.capitalText.text = data[position].capital
        holder.itemView.imageView.setImageResource(data[position].armId)
        val provinceName =  holder.itemView.provinceName.text
        holder.itemView.setOnClickListener {
                val intent = Intent(holder.itemView.context, MainActivity::class.java)
                intent.putExtra("name", provinceName)
                    holder.itemView.context.startActivity(intent)
            }

    }

    override fun getItemCount(): Int {
        return data.size
    }


}




