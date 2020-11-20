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
        var p1 = Province("Ontario", "Toronto", R.mipmap.ontario)
        list.add(p1)
        var p2 = Province("Quebec", "Quebec", R.mipmap.quebec)
        list.add(p2)
        var p3 = Province("Nova Scotia", "Halifax", R.mipmap.nova_scotia)
        list.add(p3)
        var p4 = Province("New Brunswick", "Fredericton", R.mipmap.new_brunswick)
        list.add(p4)
        var p5 = Province("Manitoba", "Winnipeg", R.mipmap.manitoba)
        list.add(p5)
        var p6 = Province("British Columbia", "Victoria", R.mipmap.british_columbia)
        list.add(p6)
        var p7 = Province("Prince Edward Island", "Charlottetown", R.mipmap.prince)
        list.add(p7)
        return list
    }

}