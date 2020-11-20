package com.example.anais_zulfequar_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var provinceName = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        provinceName = intent.getStringExtra("name").toString()
        if (provinceName == "null"){
            provinceName = "Ontario"
        }
        selectedProvince.text = provinceName
       // if (selectedProvince.text == null){
       //     selectedProvince.text = "Ontario "
      //  }
        //textView.text = selectedProvince.text
        button.setOnClickListener {
            AlertBox()
        }
    }

    //creating the dialog box
    fun AlertBox(){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Would like you like to open Second Activity ")
            .setPositiveButton("Yes"){ _ , _ ->
                goToPage2()

            }
            .setNegativeButton("No"){ _ , _ ->

            }
        alert.show()
    }

    fun goToPage2(){
       val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

}