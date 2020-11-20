package com.example.anais_zulfequar_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener {
            var layoutManager = LinearLayoutManager(this)
            //create the data you want to display
            var data = getData()
            var adapter = MyAdapter(data, this)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = adapter

        }
    }

    fun getData(): ArrayList<Province> {
        var list = ArrayList<Province>(0)
        var p1 = Province("Ontario", "Toronto", R.mipmap.ic_launcher)
        return list
    }

}